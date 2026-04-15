package Stream_file_io;
import java.io.*;
public class File_o_s {
    public static void main(String[] args) {
        try {
            byte bWrite[] = { 11, 21, 3, 40, 5 };                  // byte array to write
            OutputStream os = new FileOutputStream("test.txt");             // output stream to write to file
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();  // closing the output stream

            // Reading the file

            InputStream is = new FileInputStream("test.txt");   //nput stream to read from file
            int size = is.available();                          // getting the size of the file

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");          // reads the bytes and prints them
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
/*FileOutputStream
该类用来创建一个文件并向文件中写数据。

如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。

有两个构造方法可以用来创建 FileOutputStream 对象。

使用字符串类型的文件名来创建一个输出流对象：

OutputStream f = new FileOutputStream("C:/java/hello")
也可以使用一个文件对象来创建一个输出流来写文件。我们首先得使用File()方法来创建一个文件对象：

File f = new File("C:/java/hello");
OutputStream fOut = new FileOutputStream(f);

FileOutputStream
该类用来创建一个文件并向文件中写数据。

如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。

有两个构造方法可以用来创建 FileOutputStream 对象。

使用字符串类型的文件名来创建一个输出流对象：

OutputStream f = new FileOutputStream("C:/java/hello")
也可以使用一个文件对象来创建一个输出流来写文件。我们首先得使用File()方法来创建一个文件对象：

File f = new File("C:/java/hello");
OutputStream fOut = new FileOutputStream(f);
 */
