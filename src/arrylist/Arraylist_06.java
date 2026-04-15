package arrylist;
import java.util.ArrayList;
public class Arraylist_06 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }
    }
}
//迭代数组列表
//我们可以使用 for 来迭代数组列表中的元素：