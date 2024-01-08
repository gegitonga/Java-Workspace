package main;

public class ck {
    public static void main(String[] args){
        System.out.println(checkPalindrome("ac"));

    }
    public static Boolean checkPalindrome(String s){

        int i = 0;
        int j = s.length() -1;
        while (i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
