package Head_First_Java.Ch15_NetWork_and_Threads;

/**
 * Created by User on 04.08.2017.
 */
public class ThreadTester {

    public static void main(String[] args) {
        Runnable threadJob = new MyRannable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("Возвращ в main");
    }
}

