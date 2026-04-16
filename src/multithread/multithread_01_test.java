package multithread;

public class multithread_01_test {
    public static void main(String args[]) {
        multithread_01 R1 = new multithread_01( "Thread-1");
        R1.start();

        multithread_01 R2 = new multithread_01( "Thread-2");
        R2.start();
    }
}
