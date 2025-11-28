package Sync;

public class DeadlockMain {

    public static void main(String[] args) {

        shopping shop= new shopping();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                shop.Zudio();
            }
        };
        Thread t1= new Thread(r1,"Zudio");

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                shop.westSide();
            }
        };

        // threads
        Thread t2= new Thread(r2,"wetside");
        t1.start();
        t2.start();

    }

}
