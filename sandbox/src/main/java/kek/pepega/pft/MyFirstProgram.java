package kek.pepega.pft;

import java.awt.*;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("pep");
		hello("kep");
		hello("dep");


		double x1 = 3;
		double x2 = 4;
		double y1 = 8;
		double y2 = 12;
		Point d = new Point(3, 4, 8, 12);
		System.out.println("Расстояние между 2 точками p1(" + d.x1 + ";" + d.y1 + ") и " + "p2(" + d.x2 + ";" + d.y2 + ")" + " = " + d.distance());


		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.X + " = " + s.area());

		Rectangle r = new Rectangle(8, 10);
		System.out.println("Площадь прямоугольника со сторонами " + r.Z + " и " + r.P + " = " + r.area());


	}

	public static void hello(String meme) {
		System.out.println("Hello, " + meme + "!!!");
	}
}


//A(3;8) B(4;12) d = корень из ((3-4)^2 + (8-12)^2)
// (3-4)^2 = 3*3-2*3*4+4*4 = 1
// (8-12)^2 = 8*8-2*8*12+12*12 = 64-192+144 = 16
// корень из 16+1 = 4.123105625617661



