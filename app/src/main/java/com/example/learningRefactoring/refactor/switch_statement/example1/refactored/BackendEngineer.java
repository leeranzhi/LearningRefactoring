package com.example.learningRefactoring.refactor.switch_statement.example1.refactored;

public class BackendEngineer extends Engineer{
    @Override
    public String getType() {
        return SwitchStatementExample1.BACKEND;
    }

    public double getBillableAmount(double salary) {
        double base = salary * 0.8;
        double tax = base * 0.1;
        return base + tax;
    }
}
