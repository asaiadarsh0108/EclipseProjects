package practice.OOPs;
public class Rectangle {
	static int perimeter(int l,int b) {
		System.out.println("Perimeter of Rectangle is :"+2*(l+b));
		return 2*(l+b);
	}
	static int area(int l, int b) {
		System.out.println("Area of Rectangle is:"+l*b);
		return l*b;
	}
}
