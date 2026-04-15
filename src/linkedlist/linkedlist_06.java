package linkedlist;
import java.util.LinkedList;

public class linkedlist_06 {

        public static void main(String[] args) {
            LinkedList<String> sites = new LinkedList<String>();
            sites.add("Google");
            sites.add("Runoob");
            sites.add("Taobao");
            sites.add("Weibo");
            // 使用 getFirst() 获取头部元素
            System.out.println(sites.getFirst());
        }
}

//获取列表开头的元素：