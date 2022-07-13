import java.util.Scanner;
class Stack{
	int a[] = new int[100];
	int top = -1;
	int m,n;

	public void push(int m){
		if(top>100){
			System.out.println("Stack is StackOverflow");
		}
		else{
			top++;
			a[top] = m;
			System.out.println("top:"+ top);
		}
	}

	public int pop(){
		if (top<=0) {
			System.out.println("Stack is underfolw");
			return 0;
		}
		else{
			top--;
			System.out.println("top:"+ top);
			return a[top];
		}
	}
	public void display(){
		if (top == 0) {
			System.out.println("Stack is empty...");
		}
		for (int i = 0;i<top ;i++ ) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public int peep(int m){
		if (top<=0) {
			System.out.println("Stack is underfolw");
			return 0;
		}
		else{
			System.out.println("top:"+ (top-m));
			return a[top-m];
		}
	}

	public void change(int m, int n){
		if (top<=0 || top>100) {
			System.out.println("StackUnderfolw");
		}
		System.out.println(top);
		a[top-m] = n;
	}
}

public class Lab4_1{
	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println("1.push\n2.pop\n3.peep\n4.change\n5.display\n6.exit");
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("Enter NO:");
			int n = s.nextInt();
			if (n == 1) {
				System.out.println("Enter element you want push:");
				st.push(s.nextInt());
			}
			else if (n == 2) {
				System.out.println("popped element is "+st.pop());
			}
			else if (n == 3) {
				System.out.println( "Enter the value of ith element:");
				int i = st.peep(s.nextInt());
				System.out.println("element is:"+i);
			}

			else if (n == 4) {
				System.out.println("enter the value of ith element you want change and update value:");
				 st.change(s.nextInt(),s.nextInt());
			}

			else if (n == 5) {
				st.display();
			}
			else{
				break;
			}
		}
	}
}