package com.basicMulti;

public class TisraThread implements Runnable {
    // implementing the thread my Thread class
    public static void main(String[] args) {

        // different ways to call the thread
        // way 1-> t1.setname==> give name
        Thread t1= new Thread();
        t1.setName("Don");

        System.out.println(t1.getName());

        // way 2:- directly passing the argument in constructor

        Thread t2 = new Thread("Chotta PANDIT");
        System.out.println("with 2nd way--> directly passing into the constructor "+ t2.getName());

        // 3rd way:- by making the instance of runnable
        // runnable--> it define kam ky karna hai

          Runnable r1= new TisraThread();
            Thread t3= new Thread(r1);
            t3.setName("Mogambo");
            // --> we make object of this --> run method ko implment karna hoga

        // 4th way :-- give instance and work both
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

// points:
