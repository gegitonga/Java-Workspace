package main;

import java.util.*;

public class Removeduplicate {
    public static int removeDuplicates(int[] nums){
        Set<Integer> st = new HashSet<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++){
            if (!st.contains(nums[i])){
                st.add(nums[i]);
                arr.add(nums[i]);
            }
        }
        int n = arr.size();
        int[] a1 = new int[n];
        for(int i = 0;i<n;i++){
            a1[i] = arr.get(i);
        }
        System.arraycopy(a1, 0, nums, 0, arr.size());
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i] + "," );
            j++;
        }
        return j;
    }
    public static void main(String[] args){
        int[] nums = {0,0,0,0,0};
        int length = removeDuplicates(nums);
        System.out.println(length);
    }
}
