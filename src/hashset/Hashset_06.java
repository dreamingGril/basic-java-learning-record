package hashset;
import java.util.HashSet;
public class Hashset_06 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
//迭代 HashSet
//可以使用 for-each 来迭代 HashSet 中的元素。