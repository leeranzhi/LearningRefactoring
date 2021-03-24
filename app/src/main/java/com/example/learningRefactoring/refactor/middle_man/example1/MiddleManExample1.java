package com.example.learningRefactoring.refactor.middle_man.example1;

public class MiddleManExample1 {
    private final Person person;

    public MiddleManExample1(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public static void main(String[] args) {
        Person person = new Person(new Department("TD", "Xi'an", "Xi'an"), "lgq");
        MiddleManExample1 middleManExample1 = new MiddleManExample1(person);


        Person person1 = middleManExample1.getPerson();

        System.out.println(person1.getBaseCity());
        System.out.println(person1.getDepartmentName());
        System.out.println(person1.getOfficeCity());
    }

}
