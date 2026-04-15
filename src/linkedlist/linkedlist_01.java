package linkedlist;
import java.util.LinkedList;
public class linkedlist_01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Google");
        list.add("Runoob");
        list.add("Taobao");
        list.add("Weibo");
        System.out.println(list);
    }

}
//以下情况使用 ArrayList :
//
//频繁访问列表中的某一个元素。
//只需要在列表末尾进行添加和删除元素操作。
//以下情况使用 LinkedList :
//
//你需要通过循环迭代来访问列表中的某些元素。
//需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
/*
LinkedList 类位于 java.util 包中，使用前需要引入它，语法格式如下：

        // 引入 LinkedList 类
        import java.util.LinkedList;

LinkedList<E> list = new LinkedList<E>();   // 普通创建方法
或者
LinkedList<E> list = new LinkedList(Collection<? extends E> c); // 使用集合创建链表
*/
