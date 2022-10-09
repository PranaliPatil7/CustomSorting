package sorting.practice;
import java.util.*;
public class Employee implements Comparable {
	int Id;
	String Name;
	String City;
	
	public Employee()
	{
		super();
	}
	public Employee(int id, String name, String city) {
		super();
		Id = id;
		Name = name;
		City = city;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(City,Id,Name);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if (obj==null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		Employee other =(Employee) obj;
		return Objects.equals(City, other.City)&&Id==other.Id && Objects.equals(Name,other.Name);
	}
	@Override
	public String toString() {
		
		return "Employee[id="+Id+",name="+Name+",city="+City+"]";
	}
//@Override
	
//		public int compareTo(Object o) {
//			Employee e=(Employee)o;
//			if(this.Id==e.Id)
//			return 0;
//			else if (this.Id>e.Id)
//			return 4;
//			else
//				return -4;
//			
//	    public int compareTo(Object o) 
//	    {
//	    	Employee n=(Employee) o;
//	    	return this.Name.compareTo(n.Name);
//	    	
//	    }
	    
	    public int compareTo(Object o) 
	    {
	    	Employee n=(Employee) o;
	    	return this.City.compareTo(n.City);
	    	
	    }
	}
	
	
	
	

