package practice.OOPs;
class A{
	public void method1() {
		System.out.println("This is the method of class A");
	}
}
class B extends A{
	@Override
	public void method1() {
		System.out.println("This is the method of class B");
	}
}
public class MethodOverriding {
	
	public static void main(String[] args) {
		B b= new B();
		b.method1();
	}
}
