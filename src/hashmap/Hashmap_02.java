//以下实例创建一个字符串（String）类型的 key 和字符串（String）类型的 value：
package hashmap;
import java.util.HashMap;
public class Hashmap_02 {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<String, String> Sites = new HashMap<String, String>();
        // 添加键值对
        Sites.put("one", "Google");
        Sites.put("two", "Runoob");
        Sites.put("three", "Taobao");
        Sites.put("four", "Zhihu");
        System.out.println(Sites);
    }
}
