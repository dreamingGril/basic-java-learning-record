package Stream_file_io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/*read() 方法是 BufferedReader 中用于读取单个字符的基础方法。*/
public class Rd {
    public static void main(String[] args) {
        String text = "Hello";
        // 使用 StringReader 将字符串包装成字符流，便于演示
        try (BufferedReader reader = new BufferedReader(new StringReader(text))) {
            int character;
            // 循环读取，直到返回 -1（表示流结束）
            while ((character = reader.read()) != -1) {
                // 将 int 类型的码点强制转换为 char 类型再打印
                System.out.println("读取到的字符: " + (char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*读取效率：read() 方法一次只读取一个字符，效率相对较低。如果需要读取大量文本，更推荐使用 read(char[] cbuf) 方法将字符读入一个数组
，或者使用 readLine() 方法按行读取。
与 readLine() 的区别：
read(): 读取单个字符，返回 int，到达末尾返回 -1。
readLine(): 读取一整行文本，返回 String，到达末尾返回 null。这是 BufferedReader 最常用也最方便的方法之一。
资源管理：使用完 BufferedReader 后，务必调用 close() 方法来释放系统资源.
在 Java 7 及以上版本，推荐使用 try-with-resources 语句（如上例所示），它会在代码块执行完毕后自动关闭流，避免资源泄漏。
 */