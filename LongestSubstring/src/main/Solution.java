package main;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args){
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        System.out.println("After initializing a set" + set);
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                System.out.println("!set.contains(s.charAt(j++)" + s.charAt(j++) + " j : " + j);
            }
        }
        return max;
    }
}
