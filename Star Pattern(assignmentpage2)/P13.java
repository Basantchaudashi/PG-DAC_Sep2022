class P13{
 public static void main(String args[])
 {
       int i,j,k;
	  for(i=1;i<=5;i++)
	  {
	    for(j=1;j<i;j++)
	    {
	        System.out.print(" ");
		}
		for(j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		
		System.out.println();
	  }	
	   for(i=2;i<=5;i++)//rows
	{
		for(j=5;j>i;j--)//space
		{
			System.out.print(" ");
			
		}
		for(j=1;j<=i;j++)//col
		{
			System.out.print("*");
			
		}
		
		System.out.println();
    }
}

}	  