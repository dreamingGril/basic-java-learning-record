package com.try_catch_study;
import java.io.*;
import java.sql.*;
public class more_try_catch_contain {
    //如下这种互不继承的异常，同时可能抛出 SQLException 和 IOException：
    //实例
    public static void main(String[] args) {
try {
        // 同时可能抛出 SQL 和 IO 异常
        doSomething();
    } catch (SQLException | IOException e) {                //SQLException 和 IOException 都是 Exception 的直接子类，它们之间没有父子关系，是“兄弟”，所以可以用 | 连接。
        System.out.println("发生了 SQL 或 IO 异常！");
        e.printStackTrace();                                /*当你调用 e.printStackTrace() 时，控制台通常会输出类似下面这样的内容：
                                                        java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
                                                        at com.example.MyClass.main(MyClass.java:10)
                                                         at com.example.App.start(App.java:5)*/
    }
}
private static void doSomething() throws SQLException, IOException {
        if (Math.random() > 0.5) {
            throw new SQLException("发生了 SQL 异常！");
        } else {
            throw new IOException("发生了 IO 异常！");
        }
}
}
/*
多异常合并捕获，可以用一个 catch 块处理多个无继承关系的异常。

try {
    // 可能抛出多个不同类型异常的代码
} catch (异常类型1 | 异常类型2 | 异常类型3 异常变量) {                  异常类型1、异常类型2 等 不能有继承关系，否则会导致编译错误。
    // 统一处理
}
*/
/*如果你只写 System.out.println(e)，通常只能看到异常的名字（如 java.lang.NullPointerException），你不知道错误发生在哪一行代码。
而 printStackTrace() 会打印出堆栈跟踪（Stack Trace），也就是代码执行的“足迹”。它能帮你迅速定位到是哪一行代码“炸”了，是开发阶段排查 Bug 的神器。
*/