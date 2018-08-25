import java.util.*;
class arrayss {
	
	public static void main(String[] args)
	{
		int i,sum=0;
		boolean flag = false;
		System.out.println("enter a length of array");
		Scanner sc = new Scanner(System.in);
		int n =	sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		
		System.out.println("enter a value in 1st array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		   
		System.out.println("enter a value in 2nd array");
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();	
		}
		  
		  for(i=0;i<n;i++)
		  {
			  while(a[i]!=b[i])
			  {
				  flag = true;
				  break;
			  } 
		  } 
			if(flag)
				
			System.out.println("contain different value");
			else 
				System.out.println("Both array contain same value");
				
				
	}
}