package com.example.learningRefactoring.refactor.switch_statement.example1.refactored;

public class EngineerFactory {
    public EngineerFactory() {
    }

    static Engineer createEngineer(String type) {
        if (SwitchStatementExample1.BACKEND.equals(type)) {
            return new BackendEngineer();
        } else if (SwitchStatementExample1.FRONTEND.equals(type)) {
            return new FrontendEngineer();
        } else if (SwitchStatementExample1.FULL_STACK.equals(type)) {
            return new FullStackEngineer();
        } else {
            throw new IllegalArgumentException("type cannot handle");
        }
    }
}