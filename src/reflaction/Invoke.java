package reflaction;

/*invoke 是 java.lang.reflect.Method 类中的一个核心方法。
它的含义：英文原意是“召集、调用”。在 Java 反射中，它的作用就是代替编译器去执行一个方法。
为什么需要它：
普通调用：你在代码里写 car.start()，编译器在编译时就已经知道要调用 Car 类的 start 方法。这是硬编码。
反射调用：框架（如 Spring）在运行时拿到一个对象，它不知道这个对象具体是什么类，也不知道有哪些方法。
它只能通过 Method 对象拿到方法的“指针”，然后用 invoke 告诉 JVM：“不管这是啥对象，立刻执行这个方法！
invoke 的方法签名通常是：invoke(Object obj, Object... args)。这经常让初学者困惑，为什么要传这些参数？
// 1. 获取方法对象
Method startMethod = clazz.getMethod("start");

// 2. 调用 invoke
// 参数1 (obj): carObj。意思是“在**这辆车**上执行启动”。
// 参数2 (args): 无。因为 start() 方法本身不需要参数。
startMethod.invoke(carObj);

// 假设 Car 类还有一个方法: public void drive(int speed) { ... }

// 1. 获取方法对象，必须指定参数类型
Method driveMethod = clazz.getMethod("drive", int.class);

// 2. 调用 invoke
// 参数1 (obj): carObj。意思是“在**这辆车**上执行驾驶”。
// 参数2 (args): 60。这是传给 drive 方法的实际参数。
driveMethod.invoke(carObj, 60);
*/
