package com.example.learningRefactoring.solid.lsp;

/**
 * 定义一个长方形类，只有标准的get和set方法
 */
public class Rectangle {
  protected long width;
  protected long height;

  public void setWidth(long width) {
    this.width = width;
  }

  public long getWidth() {
    return this.width;
  }

  public void setHeight(long height) {
    this.height = height;
  }

  public long getHeight() {
    return this.height;
  }

  public double calculateArea() { return width * height; }

}