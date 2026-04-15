//添加元素
//HashMap 类提供了很多有用的方法，添加键值对(key-value)可以使用 put() 方法:
package hashmap;
import java.util.HashMap;
public class Hashmap_01 {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
    }
}




/*HashMap 的 key 与 value 类型可以相同也可以不同
可以是字符串（String）类型的 key 和 value
也可以是整型（Integer）的 key 和字符串（String）类型的 value。
HashMap 类位于 java.util 包中，使用前需要引入它，语法格式如下：

import java.util.HashMap; // 引入 HashMap 类
以下实例我们创建一个 HashMap 对象 Sites， 整型（Integer）的 key 和字符串（String）类型的 value：

HashMap<Integer, String> Sites = new HashMap<Integer, String>();
 */



//HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
//
//HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
//
//HashMap 是无序的，即不会记录插入的顺序。
//
//HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。