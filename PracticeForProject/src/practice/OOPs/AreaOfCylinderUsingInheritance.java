package practice.OOPs;

import java.util.Scanner;

public class AreaOfCylinderUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Radius:");
		int r = sc.nextInt();
		System.out.print("Enter the Height:");
		int h=sc.nextInt();
		cylinder obj = new cylinder(r,h);
		System.out.println(obj.surfaceArea(h));
		System.out.println(obj.area(r));
	}

}
class circle1{
	int radius;
	public circle1(int radius) {
		System.out.println("Cicle Method");
		this.radius = radius;
	}
	public double area(int radius) {
		System.out.print("Area of Cicle:");
		return Math.PI*radius*radius;
	}
	
}
class cylinder extends circle1{
	int height;
	public cylinder(int radius, int height) {
		super(radius);
		this.height = height;
	}
	public double surfaceArea(int height) {
		System.out.print("Area of Cylinder:");
		return Math.PI*2*height*radius;
	}
}