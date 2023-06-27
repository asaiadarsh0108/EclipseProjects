package incedo.com.basics;

public abstract class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	abstract void incrementSalary();
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
