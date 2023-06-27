package incedo.com;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee(1,"Sai",5000);
		
		e.incrementSalary(1111);
		System.out.println(e.salary);
	}

}
