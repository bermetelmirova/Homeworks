package com.company;

import java.util.Objects;

public class Country implements Comparable{
    private Integer codeOfCountry;
    private String nameOfCountry;

    public Country() {
    }

    public Country(int codeOfCountry, String nameOfCountry) {
        this.codeOfCountry = codeOfCountry;
        this.nameOfCountry = nameOfCountry;
    }

    public int getCodeOfCountry() {
        return codeOfCountry;
    }

    public void setCodeOfCountry(int codeOfCountry) {
        this.codeOfCountry = codeOfCountry;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return codeOfCountry == country.codeOfCountry && Objects.equals(nameOfCountry, country.nameOfCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeOfCountry, nameOfCountry);
    }



    @Override
    public int compareTo(Object o) {
        Country country = (Country) o;
        int result = this.nameOfCountry.compareTo(country.nameOfCountry);

//        if (result == 0) {
//            result = this.codeOfCountry.compareTo(country.codeOfCountry);
//        }
        return result;
    }

    @Override
    public String toString() {
        return "codeOfCountry=" + codeOfCountry + ", nameOfCountry=" + nameOfCountry + "\n";
    }
}
