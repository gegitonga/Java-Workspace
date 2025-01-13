import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private int maxPairs;
    List<String> answers = new ArrayList<>();

    public static void main(String[] args) {
        
    }

    public List<String> generateParenthesis(int n) {
        this.maxPairs = n;
        generate(0,0,"");
        return answers;
    }

    public void generate(int openCount, int closeCount, String currentString){
        if(openCount > maxPairs || closeCount > maxPairs || openCount < closeCount){
            return;
        }
        if(openCount == maxPairs && closeCount == maxPairs){
            answers.add(currentString);
            return;
        }
        generate(openCount + 1, closeCount, currentString + "(");

        generate(openCount, closeCount + 1, currentString + ")");

    }

}
