
public class longno {

	static int i;
	
	public static void main(String[] args) {
 int[] a={1,2,3,4};
   for(i=0;i<4;i++)
	 for(int j=i;j<4;j++)
	 {    int temp=0;
		 if(a[i]<a[j])
		 {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
	 }
 for(int k=0;k<a.length;k++)
 System.out.print(a[k]);
	}

}
