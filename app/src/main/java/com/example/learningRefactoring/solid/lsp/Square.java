package com.example.learningRefactoring.solid.lsp;

/**
 * 定义一个正方形类继承自长方形类，只有一个side
 */
public class Square extends Rectangle {
  public void setWidth(long width) {
    this.height = width;
    this.width = width;
  }

  public long getWidth() {
    return width;
  }

  public void setHeight(long height) {
    this.height = height;
    this.width = height;
  }

  public long getHeight() {
    return height;
  }

}
