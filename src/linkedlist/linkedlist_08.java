package linkedlist;
import java.util.LinkedList;
public class linkedlist_08 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));
        }
    }
}
//我们可以使用 for 配合 size() 方法来迭代列表中的元素：