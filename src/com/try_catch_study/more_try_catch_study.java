/*package com.try_catch_study;
import java.io.*;
public class more_try_catch_study {
    public static void main(String[] args) {
    try{
    file = new FileInputStream("fileName");
    x = (byte)file.read();
}catch(FileNotFoundException e){
        e.printStackTrace();
        return -1;
}catch(IOException i){
        i.printStackTrace();
        return -1;
    }
    }                    //这是错误的代码
//一个 try 代码块后面跟随多个 catch 代码块的情况就叫多重捕获。
/*try{
   // 程序代码
}catch(异常类型1 异常的变量名1){
  // 程序代码
}catch(异常类型2 异常的变量名2){
  // 程序代码
}catch(异常类型3 异常的变量名3){
  // 程序代码
}*/


//千问给的
package com.try_catch_study;
import java.io.*;

public class more_try_catch_study {
    public static void main(String[] args) {
        // 1. 在 try 外面声明变量，这样它们在整个方法里都可见
        FileInputStream file = null;
        int x = -1;

        try {
            // 2. 这里只负责赋值，不负责声明
            file = new FileInputStream("fileName");
            x = file.read();
            System.out.println("读取到的字节: " + x);

        } catch (FileNotFoundException e) {
            // 3. 处理文件找不到的异常
            System.out.println("文件没找到！");
            e.printStackTrace();
            // main 方法不能 return -1，只能打印错误
        } catch (IOException i) {               //在 Java 看来，变量名只是给代码里用的代号。编译器在检查 catch 顺序时，只看括号里的类型。
            /*父类（如 IOException）：就像是一个“大网”，它能兜住所有 IO 相关的错误。
            子类（如 FileNotFoundException）：就像是“特定的鱼”。*/
            // 4. 处理读写异常
            System.out.println("读写出错！");
            i.printStackTrace();
        } finally {
            // 5. 无论是否异常，都要尝试关闭资源
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
/*try {
        // 假设这里发生了 FileNotFoundException
        } catch (FileNotFoundException f) { // 1. 先放小网
        // 2. 如果是文件未找到，这里精准捕获，处理完结束。
        } catch (IOException i) {  // 3. 如果上面没抓到，再放“大网”兜底
        // 4. 其他 IO 异常（如流关闭失败）会被这里捕获
        }*/