package com.basicMulti;

public class DusraThread implements Runnable{

    public static void main(String[] args) {
        // by ploymorphism concept
        Runnable r1= new DusraThread();
        Thread t1= new Thread(r1);

        // 2nd thread
        Runnable r2= new DusraThread();
        Thread t2= new Thread(r2);

        // 3rd thread
        Runnable r3= new DusraThread();
        Thread t3= new Thread(r3);

        // we have to start them
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}
