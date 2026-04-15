package Iterator;
import java.util.ArrayList;
import java.util.Iterator;
public class lteratot_02 {
    public static void main(String[] args) {

        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器
        Iterator<String> it = sites.iterator();

        // 输出集合中的第一个元素
        System.out.println(it.next());
    }
}
/*统一遍历方式（解耦）
假设你现在的代码里用了 ArrayList，你可以用 sites.get(i) 来获取元素。
但如果明天需求变了，要把 ArrayList 换成 HashSet（哈希表）或者 LinkedList（链表）：
ArrayList 支持通过下标 get(i) 快速访问。
HashSet 根本不支持下标访问，因为它没有顺序。
Iterator 是通用的。不管底层是数组、链表还是哈希表，它们都实现了 Iterator 接口。你只需要把 new ArrayList 改成 new HashSet，后面的 it.next() 代码完全不用动。
安全地删除元素（最重要的场景）
这是 Iterator 最经典的使用场景。在使用增强 for 循环（for-each）遍历集合时，如果直接删除元素，会抛出 ConcurrentModificationException 异常。
错误的写法（使用 ArrayList 遍历时删除）：
java
for (String s : sites) {
    if (s.equals("Google")) {
        sites.remove(s); // 报错！并发修改异常
    }
}
正确的写法（使用 Iterator 删除）：
java
Iterator<String> it = sites.iterator();
while(it.hasNext()) {
    String s = it.next();
    if (s.equals("Google")) {
        it.remove(); // 安全！Iterator 专门提供了 remove 方法
    }
}

 */