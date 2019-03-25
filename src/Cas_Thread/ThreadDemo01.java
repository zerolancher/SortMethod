package Cas_Thread;

public class ThreadDemo01 {
    public static int count = 0;
    public static void main(String[] args) {

        for(int i = 0 ; i < 2 ; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for(int j = 0 ;j < 100;j++){
                        synchronized (ThreadDemo01.class){//Synchronized 要放在多线程中共享的变量上
                            System.out.println(Thread.currentThread().getName());
                            count++;
                        }

                    }
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count"+count);

    }
}
