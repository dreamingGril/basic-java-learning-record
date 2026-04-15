/*循环集合元素
让迭代器 it 逐个返回集合中所有元素最简单的方法是使用 while 循环：

while(it.hasNext()) {
    System.out.println(it.next());
}

 */
package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class lteratot_03 {
    public static void main(String[] args) {

        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        // 输出集合中的所有元素
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
