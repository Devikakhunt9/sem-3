import java.util.Scanner;
public class Lab3_1{
	public static void main(String[] args) {
		System.out.println("Enter A:");
		int a = scan();
		System.out.println("Enter B:");
		int b = scan();
		System.out.println("before swap:");
		System.out.println("A:"+a+"\nB:"+b);
		System.out.println("After Swapping:");
		swap(a,b);
		
	}
	public static int scan(){
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		// int n = s.nextInt();
		return m;
	}
	public static void swap(int x,int y){
		int temp = y;
		y = x;
		x = temp;
		System.out.println(x+"\n"+y);
	}
}