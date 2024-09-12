package p2;

import java.util.LinkedList;

public class A {
	public static void main(String[] args) {
		
		Employee salim = new Employee("Salim", "alam", 100);
		Employee sonu = new Employee("sonu", "kumar", 200);
		Employee akram = new Employee("akram", "ali", 300);
		
		LinkedList<Employee> empDetails = new LinkedList<Employee>();
		empDetails.add(salim);
		empDetails.add(sonu);
		empDetails.add(akram);
		
		System.out.println(empDetails);
		
		for(Employee employee : empDetails) {
			System.out.print(employee.getFirstName() +" ");
			System.out.print(employee.getLastName() + " ");
			System.out.println(employee.getId());
		}
		
	}
}
