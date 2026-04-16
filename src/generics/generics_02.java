package generics;

public class generics_02{
    public static <T extends Comparable<T>> T max(T a, T b, T c)
    {
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;
    }
public static void main(String[] args){
    System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
            3, 4, 5, max( 3, 4, 5 ) );

    System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
            6.6, 8.8, 7.7, max( 6.6, 8.8, 7.7 ) );

    System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
            "apple", "orange", max( "pear", "apple", "orange" ) );
}
}
/*
有界的类型参数:

可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围。
例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的。
要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。



看到这段定义觉得头大是很正常的！这属于 Java 泛型里比较“绕”的概念。
简单来说，有界类型参数就是给泛型加了一个“门槛”或“过滤器”。
为了让你瞬间明白，我把这段“教科书式”的定义翻译成“人话”：
1. 什么是“有界”？（为什么要加门槛？）
在普通的泛型中，<T> 就像是一个万能收纳箱，你可以往里面放任何东西（苹果、手机、数字、字符串...）。
但在某些时候，你的代码逻辑只能处理特定类型的东西。
场景： 比如你写了一个计算“平均值”的方法。
问题： 这个方法只能处理数字（Integer, Double...），如果你往里面塞一个“字符串”或者“布尔值”，代码就会报错。
解决： 你需要告诉编译器：“这个泛型 <T> 虽然灵活，但必须是数字家族的成员，别的我不收！”
这个“必须是数字家族成员”的限制，就叫有界。
2. 那个奇怪的语法 <T extends Number> 是什么意思？
你看到的 extends 关键字在这里其实有点“骗人”，它的真实含义是：“是...的子类” 或者 “实现了...的接口”。
代码： <T extends Number>
人话翻译： “定义一个类型 T，它必须继承自 Number 类（或者实现 Number 接口）。
 */