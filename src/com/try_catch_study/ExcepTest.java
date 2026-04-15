package com.try_catch_study;
import java.io.*;
public class ExcepTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println(a[3]);//刚开始我这里只放了a[3]，这行代码虽然会触发异常，但它仅仅是读取了数组下标为 4 的值，并没有把这个值打印出来或者赋值给变量。
            //虽然这确实会抛出异常并被 catch 捕获，但通常我们写代码是为了操作数据。
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
            System.out.println("Exception thrown  :" + e);
        }                                                      //try catch 语句优雅的包住了错误，后面的代码继续执行
        System.out.println("program 继续执行");
    }
}
/*检查性异常：最具代表的检查性异常是用户错误或问题引起的异常，这些异常在编译时强制要求程序员处理。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。
这类异常通常使用 try-catch 块来捕获并处理异常，或者在方法声明中使用 throws 子句声明方法可能抛出的异常。
try {
    // 可能会抛出异常的代码
} catch (IOException e) {
    // 处理异常的代码
}
或者：
public void readFile() throws IOException {
    // 可能会抛出IOException的代码
}
运行时异常： 这些异常在编译时不强制要求处理，通常是由程序中的错误引起的，例如 NullPointerException、ArrayIndexOutOfBoundsException 等，这类异常可以选择处理，但并非强制要求。
try {
    // 可能会抛出异常的代码
} catch (NullPointerException e) {
    // 处理异常的代码
}
错误： 错误不是异常，而是脱离程序员控制的问题，错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。*/

