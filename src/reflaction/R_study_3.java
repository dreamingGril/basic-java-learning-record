package reflaction;
import java.lang.reflect.*;
public class R_study_3 {
    public static void main(String[] args) {
        try {
            // 1. 获取 Class 对象
            Class<?> clazz = Car.class;

            // 2. 使用反射创建对象 (调用构造函数)
            // 对应代码: new Car("Toyota", 2023);
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            //在反射中：如果你要用反射创建对象，不能直接用 new，而是要先通过 clazz.getConstructor(...)
            // 找到这个构造函数，然后调用它的 newInstance(...) 方法。
            //clazz找到，clazz得到！
            Object carObj = constructor.newInstance("Toyota", 2023);

            // 3. 访问私有字段 (model)
            // 反射可以突破 private 的限制
            Field modelField = clazz.getDeclaredField("model");
            modelField.setAccessible(true); // 暴力反射，允许访问私有变量

            // 获取值
            String model = (String) modelField.get(carObj);
            System.out.println("当前车型: " + model);

            // 修改值
            modelField.set(carObj, "Tesla");
            System.out.println("修改后的车型: " + modelField.get(carObj));

            // 4. 调用方法 (start)
            Method startMethod = clazz.getMethod("start");
            // 此时 start 方法内部打印的 model 已经是修改后的 "Tesla" 了
            startMethod.invoke(carObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*getDeclaredField("model") vs getField("model")
注意这里必须用 getDeclaredField。
getField 只能获取 public 的字段。
getDeclaredField 可以获取所有访问权限（包括 private）的字段，但需要配合 setAccessible(true) 才能读写。
invoke(carObj)
在调用 start() 时，虽然代码里没有传参，但 invoke 的第一个参数必须是 对象实例（即 carObj），告诉 JVM 到底是哪一辆车在启动。*/