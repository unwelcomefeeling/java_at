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
		Point d = new Point(x1,y1,x2,y2);
		System.out.println("Расстояние между 2 точками p1(" + d.x1 + ";" + d.y1 + ") и " + "p2(" + d.x2 + ";" + d.y2 + ")" + " = " + d.distance());


		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(8, 10);
		System.out.println("Площадь прямоугольника со сторонами " + r.Z + " и " + r.P + " = " + r.area());


	}

	public static double distance(double x1, double x2, double y1, double y2){
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}

	public static void hello(String meme) {
		System.out.println("Hello, " + meme + "!!!");
	}


//		double x1 = 3;
//		double x2 = 4;
//		double y1 = 8;
//		double y2 = 12;
//		System.out.println("Расстояние между двумя точками на плоскости с точками p1(" + x1 + ";" + y1 + ")" + "p2(" + x2 + ";" + y2 + ")" + "=" + distance());
//	}
//
//	//A(3;8) B(4;12) d = корень из ((3-4)^2 + (8-12)^2)
//	// (3-4)^2 = 3*3-2*3*4+4*4 = 1
//	// (8-12)^2 = 8*8-2*8*12+12*12 = 64-192+144 = 16
//	// корень из 16+1 = 4.123105625617661
//
//	public static void hello(String somebody) {
//		System.out.println("Hello, " + somebody + "!");
//	}
//}



}