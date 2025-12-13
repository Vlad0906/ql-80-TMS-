package lesson20.settingMinimumAndMaximum;

public class MyThread extends Thread{
    private Runnable runnable;

    MyThread(Runnable runnable){
        this.runnable = runnable;
    }

    @Override
    public void run(){
        runnable.run();
    }
}
