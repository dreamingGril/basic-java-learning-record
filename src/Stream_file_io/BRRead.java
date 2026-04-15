package Stream_file_io;
import java.io.*;
/*Java 的控制台输入由 System.in 完成。

为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。

下面是创建 BufferedReader 的基本语法：

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

BufferedReader 对象创建后，我们便可以使用 read() 方法从控制台读取一个字符，或者用 readLine() 方法读取一个字符串。
 */

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("输入字符, 按下 'q' 键退出");
        do{
            c = (char)br.read();
            System.out.println("You entered: " + c);
        }while(c!='q');

    }

}
