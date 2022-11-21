package com.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fibonacci {

    public static void main(String args[]){
        System.out.println(fib(7));

         List<Integer> bunnies = new ArrayList<>();
         bunnies.add(3);
         bunnies.add(5);
         bunnies.add(1);

         bunnies.sort(Comparator.naturalOrder());

        System.out.println(bunnies);

    }

    public static int fib(int num){

        int a = 0, b = 0, c = 1;

        for(int i = 0; i <= num; i++){
            a = b;
            b = c;
            c = a + b;
        }
        return a;
    }
}
