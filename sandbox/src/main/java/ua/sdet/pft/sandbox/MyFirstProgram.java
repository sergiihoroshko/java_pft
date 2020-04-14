package ua.sdet.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
    	hello("world");
    	hello("user");
    	hello("Serhii");

        double len = 8.0;
		System.out.println("Square area with side " + len + " = " + ares(len));

		double a = 4;
		double b = 6;
		System.out.println("rectangle area with sides" + a + b + " = " + area(a, b));
    }

    public static void hello(String x) {
		System.out.println("Hello, " +  x + "!");
	}

	public static double ares(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
    	return a * b;
	}
}