package arrylist;
import java.util.ArrayList;
public class Arraylist_07 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (String site : sites) {
            System.out.println(site);
        }
    }
}
//也可以使用 for-each 来迭代元素：