package hashset;
import java.util.HashSet;
public class Hashset_05 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        System.out.println(sites.size());
    }
}
//计算大小
//如果要计算 HashSet 中的元素数量可以使用 size() 方法：