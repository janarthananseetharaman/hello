
public class arr {

	static int i=0;
	public static void main(String[] args) {
       int a[]={4,2,3,4,2};
       int d = 0,e = 0;
       int b=a.length;
       int c=b/2;
       if(b%2!=0)
       {
    	   c=c+1;
       }
       for(i=0;i<c;i++)
       {
    	   d=d+a[i];
       }
       d=d/c;
       for(int j=i;j<b;j++)
       {
    	   e=e+a[j];
       }
       e=e/(b-c);
       if(d==e)
       {
    	   System.out.println("first array is:");
    	   for(int k=0;k<c;k++)
    	   {
    		   System.out.println(a[k]);
    	   }
    	   System.out.println("second array is:");
    	   for(int l=i;l<b;l++)
    	   {
    		   System.out.println(a[l]);
    	   }
       }
       else
       {
    	   System.out.println("The given input is wrong");
       }
	}

}
