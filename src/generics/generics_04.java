package generics;

public class generics_04 <T>{
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        generics_04<Integer> integerBox = new generics_04<Integer>();
        generics_04<String> stringBox = new generics_04<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("嘎嘎地拉塞" ));

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}
//帮我省去了强制转化的麻烦
