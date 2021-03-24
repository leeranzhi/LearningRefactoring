package com.example.learningRefactoring.refactor.switch_statement.example2;

public class StrategyFrontend extends StrategyEngineer {
    @Override
    String getType() {
        return Engineer.FRONTEND;
    }

}
