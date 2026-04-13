package com.basic_study;

public class TestAnimal {
    public static void show(Animal a) {
a.eat();
if (a instanceof Dog) {
    Dog d = (Dog) a;
    d.work();
}else if (a instanceof Cat) {
    Cat c = (Cat) a;
    c.work();
}
    }
    //在 Java 中，静态方法（static）只能直接调用其他静态成员（变量或方法）。
    //main 方法是静态的： 程序启动时，Java 虚拟机（JVM）不需要创建 Test 类的对象，直接通过类名调用 main 方法。
    //show 方法被 main 调用： 既然 main 是静态的，它想要调用 show 方法，show 方法也必须是静态的。
    //如果不加 static 会发生什么？
    //如果不加 static，show 就变成了一个实例方法（对象方法）。此时，你必须先创建 Test 类的对象，才能调用 show。代码会变成这样，非常麻烦：

    //public static void main(String[] args) {
    //    // 必须先 new 一个 Test 对象，才能调用 show
    //    Test test = new Test();
    //    test.show(new Cat());
    //}
    //为了方便测试代码（写作业），我们通常把工具方法都写成 static，这样就可以直接在 main 里用了。
    public static void main(String[] args) {
show(new Cat());        // 以 Cat 对象调用 show 方法
show(new Dog());        // 以 Dog 对象调用 show 方法
Animal a = new Cat();   //向上转型
a.eat();                //调用的是Cat的eat方法
Cat c = (Cat) a;        //向下转型
c.work();
    }
}
//这是我对Java语言的复习，体现继承，多态的思想
