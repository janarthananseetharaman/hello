import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		if(a!=0)
		{
			if(a%2==0)
				System.out.println("The Given number is even");
			else
				System.out.println("The Given number is odd");
		}
		else
		{
			System.out.println("The Given number is zero");
		}

	}

}
