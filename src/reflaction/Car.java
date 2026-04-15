package reflaction;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("The " + model + " car of year " + year + " is starting.");
    }
}
