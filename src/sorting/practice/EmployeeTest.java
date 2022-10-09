package sorting.practice;
import java.util.*;


public class EmployeeTest {
	public static void main(String[]ar)
	{

		Employee e1=new Employee(40,"sham","Pune");
		Employee e2=new Employee(20,"Krishna","Sangli");
		Employee e3=new Employee(30,"Radha","Mumbai");
	
		Employee id=new Employee();
		TreeSet ts=new TreeSet();
		ts.add(e2);
		ts.add(e1);
		ts.add(e3);
		System.out.println("Assending order using Id" +ts);
		
		


	}
}
