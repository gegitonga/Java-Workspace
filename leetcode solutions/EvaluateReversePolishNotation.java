import java.util.*;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int j = evalPRN(tokens);
        System.out.println(j);
    }
    public static int evalPRN(String[] tokens){
        Stack<Integer> stck = new Stack<>();
        for(String token: tokens){
            if("+-*/".contains(token)) {
                int b = stck.pop();
                int a = stck.pop();

                switch (token) {
                    case "+":
                        stck.push(a + b);
                        break;
                    case "-":
                        stck.push(a - b);
                        break;
                    case "*":
                        stck.push(a * b);
                        break;
                    case "/":
                        stck.push(a / b);
                        break;
                }
            }else {
                stck.push(Integer.parseInt(token));
            }
        }
        return stck.pop();
    }

}
