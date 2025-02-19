package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args)
	{
		Square s = new Square(5);
		Rectangle re = new Rectangle(2, 3);
		System.out.println("Hello, world!");
		System.out.println("Площадь квадрата со сторонами " + s.r +  " = " + area(s));
		System.out.println("У нашего квадрата длина стороны = " + s.r);
		System.out.println( "Площадь прямоугольника со сторонами " + re.a + " и " + re.b + " = " + area(re));
		System.out.println("Сумма площадей квадрата со сторонами " + s.r + " и прямоугольника со сторонами " + re.a + " и " + re.b + " равна " + sumOfAreas(s, re));
	}
	public static double area (Square s) {
		return s.r * s.r;
}
	public static double area (Rectangle s) {
		return s.a * s.b;
	}
	public static double sumOfAreas (Square a, Rectangle b){
		return area(a) + area(b);
	}
}