import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateStackSequences {
    public static void main(String[] args) {

    }

    public static boolean validateStackSequences(int[] pushed, int[] popped){
        Deque<Integer> stck = new ArrayDeque<>();
        int popIndex= 0;

        for(int num: pushed){
            stck.push(num);
            while(!stck.isEmpty() && stck.peek() == popped[popIndex]){
                stck.pop();
                popIndex++;
            }
        }
        return popIndex == pushed.length;
    }

}
