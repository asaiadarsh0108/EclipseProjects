package ImplementationOfAbstractClasses;
abstract class Pen{
	abstract void write();
	abstract void refill();
	
}
class FountainPen extends Pen{
	void write() {
		System.out.println("I am Writing...!");
	}
	void refill() {
		System.out.println("Fountain Pen is Refilled...!");
	}
	void Changenib() {
		System.out.println("Changing nib...!");
	}
}
public class AbstractMethod1 {
	public static void main(String[] args) {
		FountainPen pen= new FountainPen();
		pen.Changenib();
		pen.refill();
		pen.write();
	}

}
