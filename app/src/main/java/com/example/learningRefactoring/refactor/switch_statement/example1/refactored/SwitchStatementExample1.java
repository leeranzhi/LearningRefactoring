package com.example.learningRefactoring.refactor.switch_statement.example1.refactored;

public class SwitchStatementExample1 {
    public static final String BACKEND = "Backend";
    public static final String FRONTEND = "Frontend";
    public static final String FULL_STACK = "FullStack";
    private final double salary;

    public SwitchStatementExample1(double salary) {
        this.salary = salary;
    }

    double getBillableAmount(String type) {
       return  EngineerFactory.createEngineer(type).getBillableAmount(salary);
    }


}
