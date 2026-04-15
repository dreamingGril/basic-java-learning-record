package reflaction;
import java.lang.reflect.*;
public class R_study_2 {
    public static void main(String[] args) throws Exception {
        // 获取 Class 对象
        Class<?> clazz = Person2.class;

        // 创建对象
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
        Object person = constructor.newInstance("John", 30);

        // 访问字段
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        //setAccessible(true)：这是反射的“暴力”体现。即使 name 是 private 的，
        // 加上这句话也能强行访问和修改。这打破了 Java 的封装性。
        System.out.println("Name: " + nameField.get(person));

        // 修改字段
        nameField.set(person, "Doe");           //作用：把 person 对象里的 name 值改成了 "Doe"。
        System.out.println("Updated Name: " + nameField.get(person));

        // 调用方法
        Method greetMethod = clazz.getMethod("greet", String.class);
        greetMethod.invoke(person, "World");
    }
}
