package com.company.Dao;

import com.company.Model.Country;

public interface CountryDao {
    void saveCountry(Country country);
    void letterK(Country country);
    void getPopulationOfCountry(Country Country);
    void addStateLanguage(Country country);
    void showCountry();
}
