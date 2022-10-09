package sorting.practice;
import java.util.*;
public class Student implements Comparable{
	
	
	int roll;
	String name;
	
	public Student() {
		super();
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && roll == other.roll;
	}

//	public int compareTo(Object o) {
//		Student s=(Student)o;
//		if(this.roll==s.roll)
//		return 0;
//	else if (this.roll>s.roll)
//		return 4;
//		else
//			return -4;
//	}
	 public int compareTo(Object o) 
	    {
	    	Student s=(Student) o;
	    	return this.name.compareTo(s.name);
	    	
	    }
	
	
}
