package generics;

public class generics_03_test {
    public static void main(String[] args) {
        // 1. 创建两个学生对象
        generics_03 s1 = new generics_03("小明", 85);
        generics_03 s2 = new generics_03("小红", 92);

        // 2. 开始比较！
        // 调用 s1 的 compareTo 方法，把 s2 传进去
        // 意思就是：问 s1，“你跟 s2 比，结果怎么样？”
        int result = s1.compareTo(s2);

        // 3. 根据返回的数字判断结果
        if (result > 0) {
            System.out.println("结果：s1 比 s2 大（分数更高）");
        } else if (result < 0) {
            System.out.println("结果：s1 比 s2 小（分数更低）");
        } else {
            System.out.println("结果：s1 和 s2 一样大（分数相同）");
        }

        // 4. 顺便打印一下对象看看（会调用 toString）
        System.out.println("s1是：" + s1);
        System.out.println("s2是：" + s2);
    }
}
