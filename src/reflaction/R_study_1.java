package reflaction;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
public class R_study_1 {
    public static void main(String[] args) throws Exception {
        // 创建对象实例
        Person personInstance = new Person();

        // 获取 Class 对象
        Class<?> clazz = Person.class;
        /*这行代码获取了 Person 类对应的 Class 对象。
Class<?> 是一个泛型类型，表示“某个未知类型的类”。
.class 是获取 Class 对象的一种方式（还有其他如 obj.getClass() 或 Class.forName("...")）。*/

        // 调用 sayHello()
        Method method = clazz.getMethod("sayHello");
        method.invoke(personInstance); // 输出: Hello!
        /*clazz.getMethod("sayHello")：在 Person 类中查找名为 sayHello 且无参数的公共（public）方法。
method.invoke(personInstance)：在 personInstance 这个对象实例上执行该方法。*/

        // 调用 greet("World")
        Method methodWithArgs = clazz.getMethod("greet", String.class);
        methodWithArgs.invoke(personInstance, "World"); // 输出: Hello, World
        /*getMethod("greet", String.class)：查找名为 greet、且接受一个 String 类型参数的公共方法。
invoke(..., "World")：调用时传入实际参数 "World"。*/
    }
}
