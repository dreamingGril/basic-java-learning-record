package reflaction;
/*
public class Conclusion {
}

Spring 的依赖注入
在 Spring 中，你不需要 new Service()。Spring 容器在启动时，就是通过这种反射机制：
扫描你的类。
通过 getConstructor 找到构造函数创建对象。
通过 setAccessible 和 field.set 给加了 @Autowired 的属性赋值。
框架的通用性
比如 JSON 解析库（Jackson/Gson）：
它们不知道你的类里有哪些字段。
但它们可以通过反射遍历所有字段，把 JSON 的字符串自动填进去（field.set）。
 */