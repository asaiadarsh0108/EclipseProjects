package Lamda;

public class FuntionalInterface {
	public static void main(String[] args) {
		MyUtilInterface<Integer> m= a->a%2==0;
		System.out.println(m.testIt(12));
		
		MyUtilInterface<String> n =s-> s.length()<3;
		System.out.println(n.testIt("adarsh"));
	}
}

