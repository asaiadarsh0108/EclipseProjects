package incedo.com.basics;

public class ContractualEmployee extends Employee {
	int payByhour;
	public ContractualEmployee(int id, String name, int payByhour) {
		super(id, name);
		this.payByhour = payByhour;
	}
	void incrementSalary() {
		this.payByhour=payByhour+5000;
	}
	@Override
	public String toString() {
		return "ContractualEmployee [payByhour=" + payByhour + ", id=" + id + ", name=" + name + "]";
	}
	
}
