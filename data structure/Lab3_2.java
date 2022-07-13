import java.util.Scanner;
class Employee_Detail{
	String employee_id, name, designation, salary;
	Scanner input = new Scanner(System.in);

	public void readDetail(){
		System.out.println("Enter Id:");
	 	employee_id = input.nextLine();
	 	System.out.println("Name:");
	 	name = input.nextLine();
	 	System.out.println("designation:");
	 	designation = input.nextLine();
	 	System.out.println("Salary:");
	 	salary = input.nextLine();	 	
	}

	public void printDetails(){
		System.out.println("ID:" + employee_id+"\nName:" + name+"\nDesignation:" + designation + "\nSalary:" + salary);
	}
}
public class Lab3_2{
	public static void main(String[] args) {
		Employee_Detail e = new Employee_Detail();
		e.readDetail();
		System.out.println("\n");
		e.printDetails();

	}
}