package reflaction;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void greet(String message) {
        System.out.println(name + " says: " + message);
}
}
