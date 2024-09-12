package methods;



public class Main
{
	
	void print(Students s){
	    System.out.println(s.id + " " + s.name );
	}
	
	void printEm(Employee e){
	   System.out.println(e.id + " "+ e.salary);
	}
	
	void productData(Product p){
	    System.out.println(p.productId + "- "+ p.productName  + "-"+ p.productPrice);
	}
	
	void doctorData(Doctor d) {
		System.out.println("doctor name is : " + d.dname + " and age is : " + d.dage);
	}
	
	
	public static void main(String[] args) {
		Main m = new Main();
// 		Students s = new Students();
// 		s.id = 5;
// 		s.name = "irfan";
		
// 	    m.print(s);
	    
// 	    Employee e = new Employee();
// 	    e.id = 1001;
// 	    e.salary = 234343.00;
	    
// 	    m.printEm(e);

//        Product p = new Product();
//        p.productId = 12;
//        p.productName = "soap";
//        p.productPrice = 234.50;
//        
//        m.productData(p);
		
		Doctor d = new Doctor();
		d.dname = "chauhan ji";
		d.dage = 34;
		
		m.doctorData(d);
	}
}

class Doctor{
	String dname;
	int dage;
}


class Product{
    int productId;
    String productName;
    double productPrice;
}

class Students{
    int id;
    String name;
}

class Employee{
    int id;
    double salary;
}