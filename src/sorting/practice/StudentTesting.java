package sorting.practice;
import java.util.*;
public class StudentTesting {
	public static void main(String[]ar)
	{
		Student s=new Student(10,"nilu");
		Student s1=new Student(17,"sanu");
		Student s2=new Student(71,"janu");
		
		TreeSet ts=new TreeSet();
		ts.add(s);
		ts.add(s1);
		ts.add(s2);
		System.out.println("Assending order using RollNo" +ts);

		


	}
}
