package main;

public class Casting {
    public static void main(String[] args){
        Animal myanimal = new Dog();
        doAnimalStuff(myanimal);
    }
    public static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        if(animal instanceof Dog) {
            Dog mydog = (Dog) animal;
            mydog.growl();
        }
    }
}
