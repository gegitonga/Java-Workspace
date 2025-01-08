import java.util.Stack;

public class RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        String b = removeStars(s);
        System.out.println(b);
    }
    public static String removeStars(String s) {
        Stack<Character> stck =  new Stack<>();
        for(int i=0; i < s.length();i++){
            if(s.charAt(i) == '*'){
                stck.pop();
            }else {
                stck.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c: stck){
            sb.append((c));
        }
        return sb.toString();
    }
}
