这是更加方便的阅览笔记，记录了我的一些问题

1.包的命名规范
包的命名有一套非常成熟且广泛遵循的规范，遵循这套规范能让你的代码看起来更专业，也能有效避免命名冲突。
核心原则可以概括为：域名反转 + 项目/模块名 + 功能模块，并且全部使用小写字母。
核心命名规范
域名反转
这是最重要的一条规则。为了确保包名的全球唯一性，通常使用你或你公司拥有的互联网域名的倒序形式作为包名的前缀。
例如，如果你的域名是 example.com，那么包名前缀就是 com.example。
像 Apache 这样的组织，域名是 apache.org，所以它们的包名前缀是 org.apache。
全部小写
包名的所有部分都必须使用小写英文字母，不使用大写字母。
推荐：com.example.myproject
不推荐：com.Example.MyProject
点号分隔
使用英文句点 . 来分隔包名的各个层级，每个点号在物理上对应一个文件夹。
通用结构
一个标准的包名通常遵循以下结构：
顶级域名.公司或组织名.项目名.功能模块名
顶级域名：常见的有 com（商业公司）、org（非营利组织）、net（网络服务）、edu（教育机构）等。
公司或组织名：例如 google、apache、alibaba。
项目名：你的具体项目名称，例如 spring、ecommerce。
功能模块名：表示代码的具体功能，例如 util（工具类）、service（业务逻辑）、controller（控制层）。
示例
公司项目	com.alibaba.ecommerce.service	阿里巴巴电商项目的服务层
开源项目	org.apache.commons.lang3	Apache 公共组件的语言工具包
个人项目	io.github.yo2ur_username.utils	个人GitHub项目的工具类

2.this关键字
public Employee(String name, String address, int number)
{
System.out.println("Constructing an Employee");
this.name = name;
this.address = address;
this.number = number;
}这段代码中的三个name怎么区分
这个问题问得非常关键，这是 Java 面向对象编程中“变量遮蔽”最典型的场景。
在这段代码中，出现了三次 name，它们其实代表了两个不同的变量和一个赋值动作。我们可以通过作用域来区分它们：
假设你的类定义大概是这样的：
java
public class Employee {
String name;    // 成员变量（属于对象）
String address; // 成员变量
int number;     // 成员变量
public Employee(String name, String address, int number) {
// ... 构造方法体 ...
}
}
那么构造方法里的这行代码：this.name = name; 的意思是：
左边的 this.name：
指代的是“当前对象的成员变量”。
this 关键字就像是指着胸口说“我自己”。
所以 this.name 指的是属于这个 Employee 对象的属性（通常在类的大括号里定义的那个 name）。
右边的 name：
指代的是“构造方法的参数”。
这是你调用这个方法时传进来的那个局部变量。
根据 Java 的规则（就近原则），在方法内部直接写 name，系统会优先寻找方法参数或方法内定义的变量。

3.

