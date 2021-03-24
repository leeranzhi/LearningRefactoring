package com.example.learningRefactoring.refactor.switch_statement.example1.refactored;

public class FullStackEngineer extends Engineer{
    @Override
    public String getType() {
        return SwitchStatementExample1.FULL_STACK;
    }

    public double getBillableAmount(double salary) {
        double base = salary * 0.7;
        double tax = base * 0.1;
        return base + tax;
    }
}
