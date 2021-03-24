package com.example.learningRefactoring.refactor.middle_man.example3;

public class Engineer {
    private String name;
    private int age;

    public Engineer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double getBillableAmount() {
        double base = 100 * 0.7;
        double tax = base * 0.1;
        return base + tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
