
public class twise {

	static int count;
	static int c=0;
	public static void main(String[] args) {
		
     int a[]={1,1,2,2,3,3};
     for(int i=0;i<6;i++)
     {
    	 count=0;
    	 for(int j=i;j<6;j++)
    	 {
    		 if(a[i]==a[j])
    		 {
    			 count=count+1;
    		 }
    	 }
    	 if(count==2)
    	 {
    		 c=c+1;
    	 }
    	 else if(count==0)
    	 {
    		 System.out.println(a[i]);
    	 }
    		
     }
     System.out.println(c);
     }
	

}
