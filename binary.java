
public class binary {

	static int e = 0;
	static int z=0;
	public static void main(String[] args) {
		int temp1;
		int temp2;
		int k = 0;
    int a[]={55,56,44,33,33,30};
    int b=a.length;
    int y[]=new int[b];
    String[] c=new String[b];
    for(int i=0;i<b;i++)
    {
    	c[i]=Integer.toBinaryString(a[i]);
    }
    for(int i=0;i<b;i++)
    {
    	System.out.println(c[i]);
    }
    int d[]=new int[b];
    for(int i=0;i<b;i++)
    {
    	int count=0;
    	e=c[i].length();
    	for(int j=0;j<e;j++)
    	{
    	if(c[i].charAt(j)=='1')
    	{
    		count=count+1;
    	}
    	}
    	d[i]=count;
    }
    for(int i=0;i<b;i++)
    {
    	System.out.println(d[i]);
    }
   for(int i=0;i<b;i++)
   {
	   for(int j=0;j<b;j++)
	   {
		   if(d[i]<d[j])
		   {
			   temp1=d[i];
			   d[i]=d[j];
			   d[j]=temp1;
			   temp2=a[i];
			   a[i]=a[j];
			   a[j]=temp2;
		   }
		   else
			   if(d[i]==d[j])
			   {
				   if(a[i]<a[j])
				   {
					   temp1=d[i];
					   d[i]=d[j];
					   d[j]=temp1;
					   temp2=a[i];
					   a[i]=a[j];
					   a[j]=temp2;
				   }
			   }
	   }
   }
    for(int i=0;i<b;i++)
    System.out.println(a[i]);
   
	}

}
