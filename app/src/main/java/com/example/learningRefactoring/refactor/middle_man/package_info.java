package com.example.learningRefactoring.refactor.middle_man;

/**
 * 中间人
 *   过度使用委托，可能会看到某个类有一半的函数都委托给其他类，这样就是过度运用-->移除中间人，直接和真正负责的对象打交道
 *   如果这样不干"实事"的函数只有少数几个在用，-->内联方法（Inline Method），把他们放进调用端
 */
