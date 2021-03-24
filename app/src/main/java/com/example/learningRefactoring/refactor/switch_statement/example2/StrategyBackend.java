package com.example.learningRefactoring.refactor.switch_statement.example2;

public class StrategyBackend extends StrategyEngineer {
    @Override
    String getType() {
        return Engineer.BACKEND;
    }

}
