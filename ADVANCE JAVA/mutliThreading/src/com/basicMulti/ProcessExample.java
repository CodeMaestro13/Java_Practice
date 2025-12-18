package com.basicMulti;

import java.io.IOException;

public class ProcessExample {
    public static void main(String[] args) {

        try{
            Process p1= new ProcessBuilder("Notepad.exe").start();
            Process p2= new ProcessBuilder("calc.exe").start();
            // another process also can be their
        }
        catch (IOException e){
            e.printStackTrace();
        }

        // this above line can store the io exception so we need to handle it


    }
}
