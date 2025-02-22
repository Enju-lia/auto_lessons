package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args)
	{
		Square s = new Square(5);
		Rectangle re = new Rectangle(2, 3);
		System.out.println("Hello, world!");
		System.out.println("Площадь квадрата со сторонами " + s.r +  " = " + s.area());//обьект который вызывается в методе area
		System.out.println("У нашего квадрата длина стороны = " + s.r);
		System.out.println( "Площадь прямоугольника со сторонами " + re.a + " и " + re.b + " = " + re.area());
	}

}