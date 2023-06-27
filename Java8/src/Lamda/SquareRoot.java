package Lamda;

public class SquareRoot {
	public static void main(String[] args) {
		sroot m= i->(int)Math.sqrt(i);
		System.out.println(m.sqro(16));
	}

}
@FunctionalInterface
interface sroot{
	public int sqro(int a);
}