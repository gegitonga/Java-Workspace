package main;

import java.awt.*;

public class TestGeometricObject {
    public static void main(String[] args){
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("same area? " + equalArea(geoObject1, geoObject2));

        displayGeometric(geoObject1);
        displayGeometric(geoObject2);
    }
    public static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }

    public static void displayGeometric(GeometricObject object){
        System.out.println();
        System.out.println(object.getArea());
        System.out.println(object.getPerimeter());
    }
}
