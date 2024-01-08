package main;

public class ComputeFactorial {
    public static void main(String[] args){
        int n = 4;
//        checkPalindrome("noonk");
        System.out.println(checkPalindrome("noon"));
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

//    public static long factorial(int n){
//        if(n == 0)
//            return 1;
//        else
//            return n * factorial(n - 1);
//    }
}
