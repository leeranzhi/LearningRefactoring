package com.example.learningRefactoring.refactor.middle_man.example3;

public class Frontend {
    private Engineer engineer;

    public Frontend(Engineer engineer) {
        this.engineer = engineer;
    }

    public String getBillableAmount() {
        double billableAmount = engineer.getBillableAmount();
        return String.valueOf(billableAmount);
    }

    public String getName() {
        return engineer.getName();
    }

    public int getAge() {
        return engineer.getAge();
    }

    @Override
    public String toString() {
        return "Frontend Name is " + engineer.getName();
    }
}
