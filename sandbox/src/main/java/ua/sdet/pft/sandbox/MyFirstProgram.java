package ua.sdet.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Serhii");

        Square square = new Square(8.5);
        System.out.println("Square area with side " + square.l + " = " + square.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("rectangle area with sides " + rectangle.a + rectangle.b + " = " + rectangle.area());
    }

    public static void hello(String x) {
        System.out.println("Hello, " + x + "!");
    }
}