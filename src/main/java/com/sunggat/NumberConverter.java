package com.sunggat;

import java.util.HashMap;
import java.util.Map;

public class NumberConverter {
    private Map<String, Integer> numbers = new HashMap<>();

    public NumberConverter() {
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);
        numbers.put("twenty", 20);
        numbers.put("thirty", 30);
        numbers.put("forty", 40);
        numbers.put("fifty", 50);
        numbers.put("sixty", 60);
        numbers.put("seventy", 70);
        numbers.put("eighty", 80);
        numbers.put("ninety", 90);
        numbers.put("hundred", 100);
        numbers.put("thousand", 1000);
    }

    public int convertToNumber(String engNumber) {
        int sum = 0;
        int thousand = 0;
        int hundred = 0;
        int num = 0;
        String numStr;

        String[] engNumberArr = engNumber.split(" ");

        for (int i = 0; i < engNumberArr.length; i++) {

            numStr = engNumberArr[i];

            if (!numStr.isEmpty()) {

                if (numStr.equals("thousand")) {
                    thousand = numbers.get(numStr);
                    if (num != 0) {
                        thousand *= num;
                        num = 0;
                        sum = 0;
                    }
                    continue;
                } else if (numStr.equals("hundred")) {
                    hundred = numbers.get(numStr);
                    if (num != 0) {
                        hundred *= num;
                        num = 0;
                        sum = 0;
                    }
                    continue;
                } else {
                    num = numbers.get(numStr);
                    sum += num;
                    continue;
                }

            }

        }
        sum = thousand + hundred + sum;
        return sum;
    }
}
