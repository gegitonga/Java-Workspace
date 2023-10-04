package main;
import java.util.*;
public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args){
        String s = "ab<c>cb?a";
        System.out.println(s +" "+ isPalidrome(s));
    }

    public static boolean isPalidrome(String s){
        //create a new string by eliminating nonalphanumeric chars
        String s1 = filters(s);

        //create a new string that is the reversal of s1
        String s2 = reverse(s1);

        //compare if the reversal string is the same as the original string
        return s2.equals(s1);
    }

    public static String filters(String s){
        StringBuilder s1 = new StringBuilder();
        for(int i= 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }
    public static String reverse(String s){
        StringBuilder s1 = new StringBuilder();
        s1.reverse();
        return s1.toString();
    }
}
