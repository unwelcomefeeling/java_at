package kek.pepega.pft;

import java.awt.*;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("pep");
		hello("kep");
		hello("dep");

		Point p1 = new Point(3, 8);
		Point p2 = new Point(4,12);
		System.out.println("Расстояние между 2 точками  = " + p1.distance(p2));

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(8, 10);
		System.out.println("Площадь прямоугольника со сторонами " + r.Z + " и " + r.P + " = " + r.area());
	}

//	public static double distance(double x1, double x2, double y1, double y2){
//		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
//	}

	public static void hello(String meme) {
		System.out.println("Hello, " + meme + "!!!");
	}



//	//A(3;8) B(4;12) d = корень из ((3-4)^2 + (8-12)^2)
//	// (3-4)^2 = 3*3-2*3*4+4*4 = 1
//	// (8-12)^2 = 8*8-2*8*12+12*12 = 64-192+144 = 16
//	// корень из 16+1 = 4.123105625617661





}