package interThreadcomm;

public class AtmExample {

    // deposite and withdraw methods in this

    int balance=1000;

    public  synchronized void withdraw(int amount){

        // condition -- if amount is more than balance then wait() ko call kro
        if(amount>balance){
            System.out.println("Insufficent Funds ,Kindly deposit to withdrwal");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        balance-=amount;
        System.out.println("Remaning balance after withdrawl is " + balance);
    }

    public synchronized void deposit(int amount){
        balance+=amount;
        System.out.println("Balance after the deposite is "+ balance);
        notify();
    }
}
