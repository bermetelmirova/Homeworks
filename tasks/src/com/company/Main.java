package com.company;

import com.company.Dao.CoachDao;
import com.company.Dao.GroupDao;
import com.company.Dao.Impl.CoachDaoImpl;
import com.company.Dao.Impl.GroupDaoImpl;

public class Main {

    public static void main(String[] args) {
//        CoachDao coachDao = new CoachDaoImpl();
//        coachDao.ShowPayment();
//        coachDao.totalSum();
//        coachDao.threeLetters();
        GroupDao groupDao = new GroupDaoImpl();
        groupDao.printAmount();
        groupDao.showGroups();
    }
}
