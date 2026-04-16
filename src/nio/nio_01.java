package nio;

/*
Java NIO 与传统 I/O 的比较
特性	Files 类 (NIO)	传统 I/O (java.io)
方法类型	静态方法	实例方法
路径表示	使用 Path 接口	使用 File 类
异常处理	统一使用 IOException	多种异常类型
功能丰富度	更丰富的功能	基础功能
符号链接处理	原生支持	有限支持
文件属性操作	更全面	有限
通过 Files 类，Java 提供了更现代、更强大的文件操作 API，推荐在新项目中使用它替代传统的 java.io.File 类。

Java NIO Files 类
java.nio.file.Files 是 Java NIO (New I/O) 包中的一个实用工具类，位于 java.nio.file 包中。

java.nio.file.Files 提供了一系列静态方法来操作文件系统中的文件和目录，大大简化了文件 I/O 操作。

主要特点
静态方法：所有方法都是静态的，无需创建实例
功能丰富：提供文件读写、属性操作、目录遍历等多种功能
异常处理：统一使用 IOException 处理文件操作异常
与 Path 配合：主要与 java.nio.file.Path 接口一起使用
常用方法分类
注意：许多方法会抛出 IOException，使用时需要进行异常处理。
 */