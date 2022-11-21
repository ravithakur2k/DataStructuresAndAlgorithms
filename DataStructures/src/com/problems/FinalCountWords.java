package com.problems;

import java.util.HashMap;
import java.util.Map;

public class FinalCountWords {

    public static void main(String args[]) {
        String str = "This this is is the done by Ravi Ravi Thakur";
        String[] arr = str.split(" ");
        var map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        isArmstrong();
    }
    public static void newMethod(){
        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("Ravi", 3);
        newMap.put("Thakur", 4);
        newMap.put("Rambo", 34);
        newMap.put("Anusha", 35);
        for(Map.Entry<String,Integer> entry: newMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    public static void secondHighestNumber(){
        int[] input = new int[]{100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        int highestNumber = Integer.MIN_VALUE;
        int secondHighestNum = Integer.MIN_VALUE;
        for(int value: input){
            if(value > highestNumber){
                secondHighestNum = highestNumber;
                highestNumber = value;
            }else if(value > secondHighestNum){
                secondHighestNum = value;
            }
        }
        System.out.println(secondHighestNum);
    }

    public static void isArmstrong(){
        int input = 371;
        int c = 0,a;
        int temp = input;
        while(input > 0){
            a = input%10;
            input = input/10;
            c += a*a*a;
        }
        if(temp == c){
            System.out.println("Is armstrong number");
        }else{
            System.out.println("Is not an armstrong number");
        }
    }

}
