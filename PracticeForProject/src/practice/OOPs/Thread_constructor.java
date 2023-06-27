package practice.OOPs;
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while(i<10) {
			System.out.println("Thread1 is running...!");
			i++;
		}
	}
}

class MyThread2 extends Thread{
	public MyThread2(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while(i<10) {
			System.out.println("Thread2 is running...!");
			i++;
		}
	}
}
public class Thread_constructor {
	public static void main(String[] args) {
		MyThread t= new MyThread("Sai");
		MyThread2 t2= new MyThread2("Adarsh");
		t.start();
		t2.start();
		System.out.println(t.getId());
		System.out.println(t.getName());
	}
}
