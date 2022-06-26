import java.util.Scanner;
public class Lab2_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of matrix(rows x cols):");
		System.out.print("rows:");
		int m = sc.nextInt();
		System.out.print("cols:");
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		for (int i = 0;i<m ;i++ ) {
			for (int j = 0;j<n ;j++ ) {
				System.out.print("A"+i+j+":");
				a[i][j] = sc.nextInt();
			}
			System.out.println(" ");
		}
		for (int i = 0 ;i < m ;i++ ) {
			for (int j = 0;j<n ;j++ ) {
				System.out.print("B"+i+j+":");
				b[i][j] = sc.nextInt();	
			}
			System.out.println(" ");
		}
		for (int i = 0;i < m ;i++ ) {
			for (int j = 0;j<n ;j++ ) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("+ ");
			for (int j = 0;j<n ;j++ ) {
				System.out.print(b[i][j]+" ");
			}
			System.out.print("= ");
			for (int j = 0;j<n ;j++ ) {
				System.out.print(a[i][j] + b[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}