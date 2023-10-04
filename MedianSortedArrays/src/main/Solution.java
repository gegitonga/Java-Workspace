package main;
import java.util.Arrays;
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArrays(nums1, nums2);

        return getMedian(mergedArray);
    }

    public static int[] mergeArrays(int[] nums1,int[] nums2){
        int length1 = nums1.length;
        int length2 = nums2.length;

        int[] mergedArray = new int[length1 + length2];

        System.arraycopy(nums1,0,mergedArray,0,length1);

        System.arraycopy(nums2, 0, mergedArray, length1, length2);


        return mergedArray;
    }

    public static double getMedian(int[] arr){
        Arrays.sort(arr);
        int l = arr.length;
        if(l % 2 == 1) {
            int index = arr.length / 2;
            double mid = arr[index];
            return mid;
        }
        else{
            int mid1 = arr[l / 2 -1];
            int mid2 = arr[l / 2];
            return ((double) mid1 + (double) mid2 ) / 2.0;
        }
    }

}
