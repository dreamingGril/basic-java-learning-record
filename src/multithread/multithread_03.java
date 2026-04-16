package multithread;

public class multithread_03 implements Runnable{
    private String message;

    public multithread_03(String message) {
        this.message = message;
    }

    public void run() {
        while(true) {
            System.out.println(message);
        }
    }
}
