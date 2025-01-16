import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {8,-8};
        astCollision(asteroids);
    }
    public static int[] astCollision(int[] asteroids){
        Deque<Integer> stck = new ArrayDeque<>();
        for(int ast : asteroids){
            if(ast > 0){
                stck.offerLast(ast);
            }else{
                while (!stck.isEmpty() && stck.peekLast() > 0 && stck.peekLast() < -ast){
                    stck.pollLast();
                } 
                
                if(!stck.isEmpty() && stck.peekLast() == -ast){
                    stck.pollLast();
                }else if (stck.isEmpty() || stck.peekLast() < 0){
                    stck.offerLast(ast);
                }
            }
        }
        return stck.stream().mapToInt(Integer::valueOf).toArray();
    }
}
