package practice.OOPs;
class CellPhone1{
	static void Ring() {
		System.out.println("Ringing...!");
	}
	static void vibrate() {
		System.out.println("Vibrating...!");
	}
	static void callFriend() {
		System.out.println("Calling Mani..!");
	}
}
public class Cellphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone1 obj = new CellPhone1();
		obj.Ring();
		obj.vibrate();
		obj.callFriend();

	}

}
