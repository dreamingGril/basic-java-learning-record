package hashset;
import java.util.HashSet;
public class Hashset_01 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);
    }
}//在上面的实例中，Runoob 被添加了两次，它在集合中也只会出现一次，因为集合中的每个元素都必须是唯一的。
//HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
//
//HashSet 允许有 null 值。
//
//HashSet 是无序的，即不会记录插入的顺序。
//
//HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
//
//HashSet 实现了 Set 接口。
/*HashSet 类位于 java.util 包中，使用前需要引入它，语法格式如下：

import java.util.HashSet; // 引入 HashSet 类
以下实例我们创建一个 HashSet 对象 sites，用于保存字符串元素：

HashSet<String> sites = new HashSet<String>();

 */
