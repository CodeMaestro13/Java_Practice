package com.basicMulti;

public class PahlaThread extends Thread{

    ///////////////////////////////////////////////////
    ///                                            ///
    ///  Thread making by extending Thread class  ///
    ////////////////////////////////////////////////

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        // lets say the default Thread is
       // System.out.println(Thread.currentThread().getName()); --> O/p -> main


        // Thread lifeCycle
        // New State--> Runnable Start--> Running State-->{Optional Blocked/Waiting state } --> Terminate State

        // Step One --> Thread can be make by 2 type that is 1) by extending the thread class 2) by implementing the runnable interface

        // state 1=> new State
        PahlaThread t1= new PahlaThread();
        PahlaThread t2= new PahlaThread();
        PahlaThread t3= new PahlaThread();

        // state 2 runnable
        t2.start();
        t1.start();
        t3.start();
        // now it will goes to run method

    }
}
