import java.util.Scanner;
class Student_Detail{
	String enrollmentNo,name;
	int sem;
	double cpi;
	Scanner input = new Scanner(System.in);

	public void getDetail(){
		System.out.println("EnrollmentNo:");
		enrollmentNo = input.nextLine();
		System.out.println("Name:");
		name = input.nextLine();
		System.out.println("Semester:");
		sem = input.nextInt();
		System.out.println("CPI:");
		cpi = input.nextDouble();
	}

	public void printDetail(){
		System.out.println("EnrollmentNo:" + enrollmentNo+ "\nName:" + name + "\nSemester:" + sem + "\nCPI:" + cpi);
	}
}
public class Lab3_3{
	public static void main(String[] args) {
		Student_Detail[] s = new Student_Detail[5];
		for (int i = 0;i<5 ;i++ ) {
			System.out.println("Student " + (i+1) + ":");
			s[i] = new Student_Detail();
			s[i].getDetail();
			s[i].printDetail();
			
		}
	}
}