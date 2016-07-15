import java.util.*;
public class num123_786 {

	
	public static void main(String[] args) {
		int a=1;
		int b;
     Scanner ob=new Scanner(System.in);
     System.out.println("Please enter the value:");
     int N=ob.nextInt();
     int c=N;
     while(N!=0)
     {
    	b=N%10;
    	a=a*b;
    	N=N/10;
     }
     a=a*c;
     System.out.println(a);
	}

}
