package main6;

public class Test6 {
    public static void main(String[] args){
        Edible2 stuff = new Chicken();
        eat(stuff);

        stuff = new Duck();
        eat(stuff);

        stuff = new Brocolli();
        eat(stuff);
    }
    public static void eat(Edible2 stuff){
        stuff.howToEat();
    }
}
interface Edible2{
    public String howToEat();
}
class Chicken implements Edible2{
    public String howToEat(){
        return "Fry it";
    }
}

class Duck implements Edible2{
    public String howToEat(){
        return "Roast it";
    }
}

class Brocolli implements Edible2{
    public String howToEat(){
        return "stir-fry it";
    }
}