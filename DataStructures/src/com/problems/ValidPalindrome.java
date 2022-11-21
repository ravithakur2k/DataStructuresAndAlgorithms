package com.problems;

public class ValidPalindrome {

    public static void main(String args[]) {
        isValidPalindrome("A man, a plan, a canal: Panama");

    }

    public static boolean isValidPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        int p2 = sb.length() - 1;
        for(int i = 0; i < sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(p2-i)) return false;
        }
        return true;
    }

}
