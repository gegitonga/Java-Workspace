package main;

public class QuotientWithException {
    public static void main(String[] args){
        int num1 = 3;
        int num2 = 0;
        try {
            if(num2 == 0)
                throw new ArithmeticException("Divisor cannot be Zero");

            System.out.println(num1/num2);
        }catch (ArithmeticException ex){
            System.out.println("Divisor cannot be Zero");
        }
    }
}
