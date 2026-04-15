package arrylist;
import java.util.ArrayList;
public class Arraylist_03 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(0, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        System.out.println(sites);
    }
}
/*修改元素
如果要修改 ArrayList 中的元素可以使用 set() 方法， set(int index, E element) 方法的第一个参数是索引（index），
表示要替换的元素的位置，第二个参数是新元素（element），表示要设置的新值
 */