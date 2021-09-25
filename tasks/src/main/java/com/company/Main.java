package com.company;

import com.company.entity.Employee;
import com.company.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class Main {
    private static final Session hibernateSession =
            HibernateUtil.getSessionFactory().openSession();

    public static void main(String[] args) {
        Employee employee = Employee.builder().fullName("Ivan Ivanov").age(50).build();
        Long createId = create(employee);
        Employee employee2 = Employee.builder().fullName("Fudik Ivanov").age(60).build();
        Long createId2 = create(employee2);
        System.out.println(read());
        delete(1L);
        update(employee2);
        deleteALl();
        HibernateUtil.shutdown();
    }

    public static List<Employee> read() {
        List<Employee> employees = hibernateSession.createQuery("FROM Employee", Employee.class).list();
        System.out.println("Find " + employees.size() + " employees");
        return employees;
    }

    public static Long create(Employee employee) {
        hibernateSession.beginTransaction();
        hibernateSession.save(employee);
        hibernateSession.getTransaction().commit();

        System.out.println("Успешно создан: " + employee.toString());
        return employee.getId();
    }

    public static Employee update(Employee employee) {
        hibernateSession.beginTransaction();
        Employee em = hibernateSession.get(Employee.class, employee.getId());
        em.setAge(employee.getAge());
        em.setFullName(employee.getFullName());
        hibernateSession.getTransaction().commit();

        return em;
    }

    public static void delete(Long id) {
        hibernateSession.beginTransaction();
        Employee e = findById(id);
        hibernateSession.delete(e);
        hibernateSession.getTransaction().commit();
        System.out.println("DELETED " + e.getFullName());
    }

    public static Employee findById(Long id) {
        Employee e = hibernateSession.get(Employee.class, id);
        return e;
    }

    public static void deleteALl() {
        hibernateSession.beginTransaction();
        int i = hibernateSession.createQuery("DELETE from Employee").executeUpdate();
        if (i > 0)
            hibernateSession.getTransaction().commit();
        else
            System.out.println("Deleting was failed!");
    }
}
