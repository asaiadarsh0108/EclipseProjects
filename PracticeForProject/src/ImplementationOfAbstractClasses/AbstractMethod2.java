package ImplementationOfAbstractClasses;

abstract class Monkey{
	void jump() {
		System.out.println("Jump...!");
	}
	void bite() {
		System.out.println("Bite..!");
	}
}

class Human extends Monkey implements BasicAnimal{
	void speak() {
		System.out.println("Hello..!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating...!");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleeping..!");
		
	}
}

interface BasicAnimal{
	void eat();
	void sleep();
}

public class AbstractMethod2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human sai = new Human();
		sai.sleep();
		Monkey m1= new Human();
//		m1.sleep();--> cannot use sleep method because the reference is monkey which doesn't have sleep method..!
		BasicAnimal pavan = new Human();
//		pavan.speak();--> cannot use speak method because the reference is BasicAnimal which doesn't have speak method..!
	}

}
