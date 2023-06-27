package practice.OOPs;

import java.util.Scanner;


public class Polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the type of shape:");
		String n=sc.next();
		String x=n.toLowerCase();
		if(x.equals("square")) {
			Square obj = new Square();
			System.out.print("Enter the value of side:");
			int m=sc.nextInt();
			obj.perimeter(m);
			obj.area(m);
		}
		else if (x.equals("rectangle")) {
			Rectangle obj= new Rectangle();
			System.out.print("Enter the Length of the Rectangle:");
			int l=sc.nextInt();
			System.out.print("Enter the Breadth of the Rectangle:");
			int b= sc.nextInt();
			obj.perimeter(l,b);
			obj.area(l,b);
//			double perimeter=object.perimeter(l,b);
//			double area=object.area(l,b);
//			System.out.println(perimeter);
//			System.out.println(area);
			
		}
		else if (x.equals("circle")) {
			Cir obj= new Cir();
			System.out.print("Enter the Radius of the circle:");
			int r= sc.nextInt();
			Cir.circumference(r);
			Cir.area(r);
		}
		else {
			System.out.println();
		}
	}

}
