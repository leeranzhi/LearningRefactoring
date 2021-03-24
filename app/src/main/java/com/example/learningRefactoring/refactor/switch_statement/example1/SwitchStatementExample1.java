package com.example.learningRefactoring.refactor.switch_statement.example1;

public class SwitchStatementExample1 {
    private final double salary;

    public SwitchStatementExample1(double salary) {
        this.salary = salary;
    }

    double getBillableAmount(String type) {
        if ("Backend".equals(type)) {
            double base = salary * 0.8;
            double tax = base * 0.1;
            return base + tax;
        } else if ("Frontend".equals(type)) {
            double base = salary * 0.7;
            double tax = base * 0.1;
            return base + tax;
        } else if ("FullStack".equals(type)) {
            double base = salary * 0.7;
            double tax = base * 0.1;
            return base + tax;
        }else {
            throw new IllegalArgumentException("type cannot handle");
        }
    }
}
