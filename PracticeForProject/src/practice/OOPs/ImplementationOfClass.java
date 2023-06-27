package practice.OOPs;

class Employee{
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
public class ImplementationOfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sai= new Employee();
		sai.setId(12);
		sai.setName("Sai Adarsh");
		sai.setSalary(215633);
		System.out.println(sai);

	}

}
