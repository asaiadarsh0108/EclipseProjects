package incedo.com.basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> e1= new ArrayList<Employee>();
		e1.add(new RegularEmployee(1,"Sai",15000));
		e1.add(new RegularEmployee(2,"Adarsh",25000));
		e1.add(new RegularEmployee(4,"Ram",20000));
		e1.add(new ContractualEmployee(6,"Pavan",8000));
		e1.add(new ContractualEmployee(5,"Kumar",6500));
		e1.add(new ContractualEmployee(8,"Dev",7500));
		for(Employee e:e1) {
			e.incrementSalary();
			System.out.println(e);
		}
		
	}

}
