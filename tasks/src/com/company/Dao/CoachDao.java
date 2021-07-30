package com.company.Dao;

import com.company.Model.Coach;

import java.sql.SQLException;
import java.util.List;

public interface CoachDao {
    List<Coach> getAll() throws SQLException;

    void ShowPayment();

    void totalSum();

    void threeLetters();
}
