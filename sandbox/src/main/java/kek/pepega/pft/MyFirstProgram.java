package kek.pepega.pft;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("Timik");
		hello("Memik");
		hello("pep");

		double l = 5;
		System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));


		double a = 4;
		double b = 6;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
	}

	public static void hello(String X) {
		System.out.println("Hello, "+X+"!");
	}


	public static double area (double len) {
		return len * len;
	}

	public static double area(double a, double b) {
		return a * b;
	}

}