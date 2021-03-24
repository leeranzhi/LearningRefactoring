package com.example.learningRefactoring.refactor.switch_statement.example2;

public class Engineer {
    public static final String FULL_STACK = "FullStack";
    public static final String FRONTEND = "Frontend";
    public static final String BACKEND = "Backend";

    private String type;
    private StrategyEngineer strategyEngineer;

    public Engineer() {
        type = FRONTEND;
        strategyEngineer = new StrategyFrontend();
    }

    double getBillableAmount(double salary) {
        if (Engineer.BACKEND.equals(salary)) {
            double base = salary * 0.8;
            double tax = base * 0.1;
            return base + tax;
        } else if (Engineer.FRONTEND.equals(getType())) {
            double base = salary * 0.7;
            double tax = base * 0.1;
            return base + tax;
        } else if (Engineer.FULL_STACK.equals(getType())) {
            double base = salary * 0.6;
            double tax = base * 0.1;
            return base + tax;
        } else {
            throw new IllegalArgumentException("cannot handle type");
        }
    }

    public void toFullStack() {
        type = FULL_STACK;
        strategyEngineer = new StrategyFullStack();

    }

    public void toFrontend() {
        type = FRONTEND;
        strategyEngineer = new StrategyFrontend();
    }

    public void toBackend() {
        type = BACKEND;
        strategyEngineer = new StrategyBackend();
    }

    public String getType() {
        return type;
    }
}
