package arrylist;
import java.util.ArrayList;
public class Arraylist_04 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);
    }
}
/*如果要删除 ArrayList 中的元素可以使用 remove() 方法：
remove(int index) 方法删除指定位置的元素，索引从 0 开始。
remove(Object o) 方法删除指定元素，如果存在多个该元素，则删除第一个匹配的元素。

 */