package main2;

interface DogInterface{
    void bark();
    void poop();
}
abstract class Dog{
    public void bark(){
        System.out.println("Bark ");
    }

    public abstract void poop();
}

class chihuahua extends Dog{
    public void poop(){
        System.out.println("Dog pooped");
    }
}

public class AbstractTutorial {
    public static void main(String[] args){
        chihuahua c = new chihuahua();
        c.bark();
        c.poop();
    }
}
