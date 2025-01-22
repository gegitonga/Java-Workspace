import java.util.*;

public class sortedSquares {
    public static void main(String[] args) {
        
    }
    public int[] sortedSquare(int[] nums) {
        List<Integer> new_list = new ArrayList<>();
        for(int n:nums){
            int b = n * n;
            new_list.add(b);
        }
        Collections.sort(new_list);

        int[] result = new int[new_list.size()];
        for(int j = 0; j < new_list.size(); j++){
            result[j] = new_list.get(j);
        }
        return result;
    }
}
