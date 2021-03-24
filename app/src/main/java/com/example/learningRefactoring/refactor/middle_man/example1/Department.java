package com.example.learningRefactoring.refactor.middle_man.example1;

public class Department {
    private String name;
    private String officeCity;
    private String baseCity;

    public Department(String name, String officeCity, String baseCity) {
        this.name = name;
        this.officeCity = officeCity;
        this.baseCity = baseCity;
    }

    public String getName() {
        return name;
    }

    public String getOfficeCity() {
        return officeCity;
    }

    public String getBaseCity() {
        return baseCity;
    }
}
