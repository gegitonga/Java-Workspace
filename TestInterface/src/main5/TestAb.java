package main5;

abstract class Animal2{
    public abstract String howToEat();
}
class Chicken extends Animal2{
    public String howToEat(){
        return "Fry it";
    }
}
class Duck extends Animal2 {
    public String howToEat(){
        return "Roast it";
    }
}

public class TestAb{
    public static void main(String[] args){
        Animal2 animal = new Chicken();
        eat(animal);

        animal = new Duck();
        eat(animal);
    }
    public static void eat(Animal2 animal){
        System.out.println(animal.howToEat());
    }
}

