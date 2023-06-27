package Lamda;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class EqualsDemo {
	public static void main(String[] args) {
		
		String s1 = "Sai";
		String s2 = "sAi";
		StringTokenizer s3= new StringTokenizer("Sai Adarsh is a java developer"," ");
		while(s3.hasMoreTokens()) {
			System.out.println(s3.nextToken());
		}
		System.out.println(s3);
		StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :", true);
	        while (st3.hasMoreTokens())
	            System.out.println(st3.nextToken());
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		boolean res= s1.equals(s2);
//		System.out.println(res);
		
		Employee e1 = new Employee(1,"sai");
		Employee e2 = new Employee(1,"sai");
		Employee e3 = new Employee(2,"adarsh");
		
		Set<Employee> employees= new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		e1.hashCode();
		System.out.println(employees);
		
//		System.out.println(e1.equals(e2));
	}

}
class Employee{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==null)
			return false;
		if(this == obj)
			return true;
		if(getClass()!=obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if(id!=other.id)
			return false;
		if(name==null) {
			if(other.name!=null) {
				return false;
			}
		}
		else if(!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public int hashCode() {
//		int prime=31;
//		int res=1;
////		System.out.println(id+" "+name);
//		res= res*prime+id;
//		res=res*prime+ ((name==null)?0:name.hashCode());
//		System.out.println(name.hashCode()+id);
//		return res;
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}