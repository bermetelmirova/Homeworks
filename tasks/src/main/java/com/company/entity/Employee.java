package com.company.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "full_name", nullable = false, unique = true)
    private String fullName;
    @Column(nullable = false)
    private Integer age;

    @Override
    public String toString() {
        return "id=" + id + ", fullName=" + fullName  + ", age=" + age + '\n';
    }
}
