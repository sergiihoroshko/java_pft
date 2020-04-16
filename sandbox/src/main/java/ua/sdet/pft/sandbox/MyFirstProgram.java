package ua.sdet.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Serhii");

        Square square = new Square(8.5);
        System.out.println("Square area with side " + square.l + " = " + ares(square));

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("rectangle area with sides " + rectangle.a + rectangle.b + " = " + area(rectangle));
    }

    public static void hello(String x) {
        System.out.println("Hello, " + x + "!");
    }

    public static double ares(Square square) {
        return square.l * square.l;
    }

    public static double area(Rectangle rectangle) {
        return rectangle.a * rectangle.b;
    }
}