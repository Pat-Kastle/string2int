package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    private static final String EMPTY_STRING = "";
    private static final int DEFAULT_ESCAPE = 11;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Integer> cNumMap = new HashMap<>();
        cNumMap.put('1',1); cNumMap.put('2',2); cNumMap.put('3',3);
        cNumMap.put('4',4); cNumMap.put('5',5); cNumMap.put('6',6);
        cNumMap.put('7',7); cNumMap.put('8',8); cNumMap.put('9',9);
        cNumMap.put('0',0);

        long sum = 0L;
        String line;
        while ((line = br.readLine()) != null && !line.equals(EMPTY_STRING)) {
            for (Character cNum : line.toCharArray()) {
                int num = cNumMap.getOrDefault(cNum, DEFAULT_ESCAPE);
                if(num != DEFAULT_ESCAPE)
                    sum = sum * 10 + num;
            }

            System.out.println(sum);
            sum = 0L;
        }
    }
}