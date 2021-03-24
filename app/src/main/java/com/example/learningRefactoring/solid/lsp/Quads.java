package com.example.learningRefactoring.solid.lsp;

public abstract class Quads {
    protected int width;
    protected int height;

    public abstract void setWidth(int width);
    public abstract void setHeight(int height);

    public int calculateArea() { return width * height; }
}