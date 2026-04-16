package generics;
import java.util.List;
import java.util.ArrayList;

public class generics_05 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

    }
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
}
//类型通配符一般是使用 ? 代替具体的类型参数。例如 List<?> 在逻辑上是 List<String>,List<Integer> 等所有 List<具体类型实参> 的父类。
//因为 getData() 方法的参数是 List<?> 类型的，所以 name，age，number 都可以作为这个方法的实参，这就是通配符的作用。