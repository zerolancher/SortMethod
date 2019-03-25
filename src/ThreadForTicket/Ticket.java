package ThreadForTicket;

public class Ticket implements Runnable {
    private int num;
    private boolean flag = true;

    public Ticket(int num) {
        this.num = num;
    }

    @Override
    public  synchronized   void run() {

        while (flag){
            if(num<= 0){
                flag = false;
               return;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"售票序列编号"+num--);

        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");
     t1.start();
        t2.start();
        t3.start();
    }
}
