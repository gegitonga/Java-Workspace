package main;

public class Demo {
    public static void main(String[] args){
        House h1 = new House(222, 1750.5);
        try {
            House h2 = (House) h1.clone();
        } catch (CloneNotSupportedException e) {

        }
    }
}
