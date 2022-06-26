import java.util.Scanner;
public class Lab2_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of  A(rows x cols):");
		System.out.print("rows:");
		int m = sc.nextInt();
		System.out.print("cols:");
		int n = sc.nextInt();
		System.out.println("enter size of  B(rows x cols):");
		System.out.print("rows:");
		int x = sc.nextInt();
		System.out.print("cols:");
		int y = sc.nextInt(); 
		int a[][] = new int[m][n];
		int b[][] = new int[x][y];
		
		if (n == x) {
			for (int i = 0;i<m ;i++ ) {
				for (int j = 0;j<n ;j++ ) {
					System.out.print("A"+i+j+":");
					a[i][j] = sc.nextInt();
				}
				System.out.println(" ");
			}
			for (int i = 0;i<x ;i++ ) {
				for (int j = 0;j<y ;j++ ) {
					System.out.print("B"+i+j+":");
					b[i][j] = sc.nextInt();
				}
				System.out.println(" ");
			}
			for (int k = 0;k<m ;k++ ) {
				for (int i = 0;i<y ;i++ ) {
					int sum = 0;
					for (int j = 0;j<n ;j++ ) {
						sum += a[k][j]*b[j][i];
					///	System.out.println("a"+k+j+"+"+"b"+j+i);
					}
					//System.out.println(" ");
				System.out.print(sum+" ");
				}
				System.out.println(" ");
			}
		}
		else{
			System.out.println("The multiplication of matrix is calculated if cols of A (Aj)= rows of B(Bi)");
		}
	}
}