package com.Khanhnn;

public class Test {
    public static void main(String[] args) {
        Shape[] arrShape= new Shape[3];

        arrShape[0]= new Circle( 3, "yellow", true);
        arrShape[1]= new Rectangle( 3, 5, "green", true);
        arrShape[2]= new Square( 5,"blue", true);

        System.out.println("Before: ");
        for (Shape shape : arrShape) {
            System.out.println(shape.toString());
        }

        System.out.println("After: ");
        for (Shape shape: arrShape){
            if (shape instanceof Circle) {
                ((Circle) shape).resize(2);
                System.out.println(((Circle) shape).getArea());
            }else if (shape instanceof Rectangle){
                ((Rectangle) shape).resize(2);
                System.out.println(((Rectangle) shape).getArea());
            }else {
                ((Square) shape).resize(2);
                System.out.println(((Square) shape).getArea());
            }
        }


    }
}
