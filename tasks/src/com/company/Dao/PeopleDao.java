package com.company.Dao;

import com.company.Model.People;

public interface PeopleDao {
    void savePerson(People person);
    void showPeople();
}
