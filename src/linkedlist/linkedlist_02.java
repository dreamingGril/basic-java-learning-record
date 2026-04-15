package linkedlist;
import java.util.LinkedList;
public class linkedlist_02 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Wiki");
        System.out.println(sites);
    }
}
//更多的情况下我们使用 ArrayList 访问列表中的随机元素更加高效，但以下几种情况 LinkedList 提供了更高效的方法。
//
//在列表开头添加元素：