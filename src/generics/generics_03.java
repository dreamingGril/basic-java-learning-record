package generics;

// 1. 这里定义类，只能有一个 public class
public class generics_03 implements Comparable<generics_03> {

    // 成员变量
    String name;
    int score;

    // 2. 构造函数：注意！前面不要加 public class，直接写方法名
    // 它必须在这个大括号 { ... } 里面
    public generics_03(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 3. compareTo 方法：实现 Comparable 接口必须写的方法
    @Override
    public int compareTo(generics_03 other) {
        return this.score - other.score;
    }

    // 4. toString 方法：帮你打印对象内容
    // 注意：你之前写成了 toSting (少了一个 r)，这里帮你改过来了
    @Override
    public String toString() {
        return this.name + " " + this.score;
    }
} // <--- 千万别忘了这个结尾的大括号，把整个类包起来