package com.try_catch_study;/*throws 关键字用于在方法声明中指定该方法可能抛出的异常。当方法内部抛出指定类型的异常时，该异常会被传递给调用该方法的代码，并在该代码中处理异常。

例如，下面的代码中，当 readFile 方法内部发生 IOException 异常时，会将该异常传递给调用该方法的代码。在调用该方法的代码中，必须捕获或声明处理 IOException 异常。
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Throws{

    // 推荐写法：使用 try-with-resources
    public void readFile(String filePath) throws IOException {
        // 1. 在 try 后面的括号里声明资源
        // 2. 无论 try 块是正常结束还是抛出异常，reader 都会自动关闭
        try (BufferedReader reader = new BufferedReader(
                new FileReader(filePath, StandardCharsets.UTF_8))) { // 显式指定 UTF-8 编码

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        // 3. 这里不需要写 finally，也不需要写 reader.close()
    }
}