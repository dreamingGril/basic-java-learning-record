package arrylist;
import java.util.ArrayList;
//访问元素
//访问 ArrayList 中的元素可以使用 get() 方法：
//get(int index) 方法返回指定位置的元素，索引从 0 开始。
//如果索引越界，则抛出 IndexOutOfBoundsException 异常。


public class Arraylist_02 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));  // 访问第二个元素
    }
}
