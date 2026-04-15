package arrylist;
import java.util.ArrayList;
public class Arraylist_05 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.size());
    }
}
//计算大小
//如果要计算 ArrayList 中的元素数量可以使用 size() 方法：