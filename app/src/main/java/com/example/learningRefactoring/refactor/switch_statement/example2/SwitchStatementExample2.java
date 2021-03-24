package com.example.learningRefactoring.refactor.switch_statement.example2;

public class SwitchStatementExample2 {
    private Engineer engineer;

    public SwitchStatementExample2(Engineer engineer) {
        this.engineer = engineer;
    }

    double getFrontendBillableAmount(double salary){
        engineer.toFrontend();
        return engineer.getBillableAmount(salary);
    }


    double getFullStackBillableAmount(double salary){
        engineer.toFrontend();
        return engineer.getBillableAmount(salary);
    }

    double getBackendBillableAmount(double salary){
        engineer.toFrontend();
        return engineer.getBillableAmount(salary);
    }



}
