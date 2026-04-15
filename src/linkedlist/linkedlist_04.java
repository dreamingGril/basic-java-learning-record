package linkedlist;
import java.util.LinkedList;
public class linkedlist_04 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        // 使用 removeFirst() 移除头部元素
        sites.removeFirst();
        System.out.println(sites);
    }
}
//在列表开头移除元素：removeFirst() 方法，该方法移除列表中的第一个元素并返回该元素的值。