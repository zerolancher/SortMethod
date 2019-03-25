package Cas_Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemoByAtomic { // 原子包装类
    public static AtomicInteger count  = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0 ;i < 2 ;i ++){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for(int j = 0 ; j < 100 ;j++){
                        count.incrementAndGet();
                    }
                }
            }).start();
            Thread.sleep(200);
            System.out.println("count"+count.get());

        }
    }
}
