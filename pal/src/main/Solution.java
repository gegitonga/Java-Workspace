package main;

class Solution {
    public static void main(String[] args){
        System.out.println(longestPalindrome("ac"));

    }
    public static String longestPalindrome(String s) {
        StringBuilder longpal = new StringBuilder();
        int size_pal = 0;
        for(int i = 0; i < s.length(); i++){
            StringBuilder tt = new StringBuilder();
            tt.append(s.charAt(i));
            for(int j = i +1; j < s.length(); j++){
                tt.append(s.charAt(j));
                System.out.println(tt);
                if (checkPalindrome(tt.toString())){
                    if (tt.length() > size_pal){
                        size_pal = tt.length();
                        longpal.setLength(0);
                        longpal.append(tt);
                    }
                }
                System.out.println("after pal check " + longpal);
            }
        }
        return longpal.toString();
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