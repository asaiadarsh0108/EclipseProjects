package incedo.com;
import java.util.ArrayList;
import java.util.List;

public class FindEmployee {

 public static void main(String[] args) {

  Employee e1 = new Employee(1, "Amit", 3433);
  Employee e4 = new Employee(11, "Ravi S", 3433);
  Employee e2 =new Employee(2, "Priya", 45454);
  Employee e3 =new Employee(12, "Rahul", 25454);
  
  List<Employee> employees = new ArrayList<>();
  employees.add(e1);
  employees.add(e2);
  employees.add(e3);
  employees.add(e4);
  
  
  // Print all the employees starting with 'R'
  System.out.println("Print all the employees starting with 'R'");
  for(Employee e : employees) {
   if(e.name.startsWith("R")) {
    System.out.println(e);
    
   }  
  }
  System.out.println();
  
   System.out.println("Print all employees having salary > 10000");
  for(Employee e: employees) {
	  if(e.salary>10000) {
		  System.out.println(e);
	  }
  }
  System.out.println();
  
  
  // Print all employees
  System.out.println("Print all employees");
  for(Employee e: employees) {
	  System.out.println(e);
  }

 }

}