package arrylist;
import java.util.ArrayList;
public class Arraylist_08 {

        public static void main(String[] args) {
            ArrayList<Integer> myNumbers = new ArrayList<Integer>();
            myNumbers.add(10);
            myNumbers.add(15);
            myNumbers.add(20);
            myNumbers.add(25);
            for (int i : myNumbers) {
                System.out.println(i);
            }
        }
    }

//ArrayList 中的元素实际上是对象，在以上实例中，数组列表元素都是字符串 String 类型。
//
//如果我们要存储其他类型，而 <E> 只能为引用数据类型，这时我们就需要使用到基本类型的包装类。
//
//基本类型对应的包装类表如下：
//
//基本类型	引用类型
//boolean	Boolean
//byte	Byte
//short	Short
//int	Integer
//long	Long
//float	Float
//double	Double
//char	Character