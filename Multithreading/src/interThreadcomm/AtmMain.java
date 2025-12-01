package interThreadcomm;

public class AtmMain {

    public static void main(String[] args) throws InterruptedException {

        AtmExample atm= new AtmExample();
        Runnable r1= new Runnable() {
            @Override
            public void run() {
                //loop lavat ahe--> for
                for(int i=0;i<5;i++) {
                    atm.withdraw(300);
                }
            }
        };
        Thread t1=new Thread(r1);

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int j=0;j<5;j++){
                    atm.deposit(200);
                }
            }
        };
        Thread t2= new Thread(r2);

        t1.start();
//        t1.join(); --> make a dedalock situation- it cause the deadlock sitiation
        t2.start();
//        t2.join(); --> make deadlock sitiation

        t1.join();
        t2.join();
        // why we are making this join here
        System.out.println("Final Balance: " +atm.balance);

    }
}
