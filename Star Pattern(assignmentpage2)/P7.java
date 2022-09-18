class P7{
	public static void main(String args[])
	{
  int i,j,k,l;
	  for(i=1;i<=5;i++)
	  {
	    for(j=5;j>=i;j--)
	    {
	        System.out.print(" ");
		}
		for(k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		for(l=1;l<=i-1;l++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	  }	
	  	  for(i=1;i<=4;i++)
	  {
	    for(j=1;j<=i+1;j++)
	    {
	        System.out.print(" ");
		}
		for(k=4;k>=i;k--)
		{
			System.out.print("*");
		}
		for(l=3;l>=i;l--)
		{
			System.out.print("*");
		}
		
		System.out.println();
	  }

}
}	  