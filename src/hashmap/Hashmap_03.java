//访问元素
//我们可以使用 get(key) 方法来获取 key 对应的 value:
//
//实例
package hashmap;
import java.util.HashMap;
public class Hashmap_03 {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites.get(3));
    }
}
