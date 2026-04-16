package multithread;

public class multithread_02_test {
    public static void main(String args[]) {
        multithread_02 T1 = new multithread_02( "Thread-1");
        T1.start();

        multithread_02 T2 = new multithread_02( "Thread-2");
        T2.start();
    }
}
