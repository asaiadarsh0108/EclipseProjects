package practice.OOPs;

public class HandlingExceptions {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int x[]= {1,2,3,4,5};
		try {
			System.out.println(x[5]);
			
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException Occured");
		}
	}

}
