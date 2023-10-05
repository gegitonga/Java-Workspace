package main4;

abstract class Car {
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }
}

abstract class RangeRover extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}

class UpdatedRange extends RangeRover{ //concrete class
    public void fly(){
        System.out.println("Flying....");
    }
}

public class Demo {
    public static void main(String[] args){
        Car c = new UpdatedRange();
        c.drive();
        c.fly();
    }
}
