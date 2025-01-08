import java.util.*;

public class FrequencyMostFrequent {
    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;
        int j =  maxFrequency(nums, k);
        System.out.println(j);

    }
    public static int maxFrequency(int[] nums, int k){
        Arrays.sort(nums);

        int n = nums.length;
        int maxFreq = 1;
        int operationsSum = 0;

        for(int left = 0, right = 1; right < n; right ++){
            operationsSum += (nums[right] - nums[right-1]) * (right - left);

            while(operationsSum > k){
                operationsSum -= (nums[right] - nums[left++]);
            }
            maxFreq = Math.max(maxFreq, right - left + 1);
        }
        return maxFreq;
    }

}