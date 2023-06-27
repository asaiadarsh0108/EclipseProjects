package incedo.com.basics;

public class RegularEmployee extends Employee{
	
	double salary;
	
	public RegularEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}

	void incrementSalary() {
		this.salary=salary*(1.1);
	}
	
	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", id=" + id + ", name=" + name + "]";
	}
	
}
