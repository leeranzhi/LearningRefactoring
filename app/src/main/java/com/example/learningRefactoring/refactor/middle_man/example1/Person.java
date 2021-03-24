package com.example.learningRefactoring.refactor.middle_man.example1;

public class Person {
    private Department department;

    private String name;

    public Person(Department department, String name) {
        this.department = department;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * TODO消除中间人
     * @return
     */
    public String getDepartmentName() {
        return department.getName();
    }

    public String getOfficeCity() {
        return department.getOfficeCity();
    }

    public String getBaseCity() {
        return department.getBaseCity();
    }
}
