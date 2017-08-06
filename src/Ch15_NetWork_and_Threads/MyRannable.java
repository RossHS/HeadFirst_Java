package Ch15_NetWork_and_Threads;

public class MyRannable implements Runnable{
    public void run(){
        go();
    }
    public void go(){
        doMore();
    }
    public void doMore(){
        System.out.println("Вершина стека");
    }
}
