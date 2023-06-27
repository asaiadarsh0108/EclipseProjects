package Exceptions;

public class ExceptionDemo {
	public static void main(String[] args) {
		A a= new A();
		try {
			int result=a.compute(10,0);
			System.out.println(result);
		} catch (DivideByZeroException|InvalidInputException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
	}

}

class A {

	public int compute(int i, int j) throws DivideByZeroException,InvalidInputException{
		// TODO Auto-generated method stub
		if(j==0) {
			throw new DivideByZeroException("Cant divide with zero");
		}
		if(j<0) {
			throw new InvalidInputException("Deno can't be negetive");
		}
		if(j>i) {
			throw new InvalidInputException("Deno cannot be greater than num");
		}
		
		return i/j;
	}
	
}