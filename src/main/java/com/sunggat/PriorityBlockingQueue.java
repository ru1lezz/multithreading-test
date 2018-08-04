package com.sunggat;

import java.util.*;

public class PriorityBlockingQueue {

    private TreeSet<Integer> values = new TreeSet<>();

    private NumberConverter numberConverter = new NumberConverter();

    synchronized void push(String value) {
        values.add(numberConverter.convertToNumber(value));
    }

    synchronized Integer pop() {
        if(values.size() >= 1) {
            return values.pollFirst();
        }
        System.out.println("Memory is empty");
        return null;
    }

}
