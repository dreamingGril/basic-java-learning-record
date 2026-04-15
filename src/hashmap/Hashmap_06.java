//计算大小
//如果要计算 HashMap 中的元素数量可以使用 size() 方法：
package hashmap;
import java.util.HashMap;
public class Hashmap_06 {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites.size());
    }
}
