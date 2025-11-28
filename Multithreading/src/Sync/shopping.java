package Sync;

public class shopping {

    String shoes="juta";
    String jacket="Bandi";
    
    public  void Zudio(){
        
        synchronized (shoes){
            System.out.println("Shoes from zudio");
                synchronized (jacket){
                    System.out.println("jacket from zudio");
                }
        }

    }
    // this is creating a deadlock situation
    public  void westSide(){
        synchronized (jacket){
            System.out.println("jacket from wetside");
                synchronized (shoes){
                    System.out.println("Shoes from wetside");
                }
        }

    }
    public static void main(String[] args) {

    }
}
