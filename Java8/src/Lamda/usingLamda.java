package Lamda;

public class usingLamda {
	public static void main(String[] args) {
		Sample.methodA();
	}
	public class Sample {
		public  static void methodA() {
			methodB(a-> a%2==0);
		}
		
		public static void methodB(myInterface m) {
			boolean result=m.isEven(10);
			System.out.println(result);
		}
	}
}


