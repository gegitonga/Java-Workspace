public class BinarySearch {
   public static void main(String[] args) {
    
   }
   public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid  = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        if(nums[left] == target){
            return left;
        }
        return -1;

   }


}
