package hashset;
import java.util.HashSet;
public class Hashset_02 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites.contains("Taobao"));
    }
}
//判断元素是否存在
//我们可以使用 contains() 方法来判断元素是否存在于集合当中:
