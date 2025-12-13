package lesson20.sortingAnArray;

public class MyThread extends Thread{
    private Runnable runnable;

    public MyThread(Runnable runnable){
        this.runnable = runnable;
    }

    @Override
    public void run(){
        runnable.run();
    }
}
