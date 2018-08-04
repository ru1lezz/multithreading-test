package com.sunggat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class App 
{
    public static void main( String[] args ) {
        final PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        new Thread(() -> {
            while (true) {
                try {
                    String input = reader.readLine();
                    priorityBlockingQueue.push(input);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(5000);
                    Integer min = priorityBlockingQueue.pop();
                    if(min != null) {
                        System.out.println("Reading " + min);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
