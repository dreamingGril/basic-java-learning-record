package hashset;
import java.util.HashSet;
public class Hashset_04 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        sites.clear();
        System.out.println(sites);
    }
}
//删除集合中所有元素可以使用 clear 方法：