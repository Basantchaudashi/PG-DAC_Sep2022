class Pyramid5{
public static void main(String args[])
{
	
  for(int i=0;i<=9;i++) 
  {
    for(int j=(9-i)-1;j>=0;j--)
	{
		System.out.print(" ");
	}
	for(int j=i-1;j>=0;j--)
	{
	  System.out.print((9-j));
	  }
	   for(int j=9;j>=i;j--)
	   {
		   System.out.print(j);
	   }
	  for(int i=8;i>=1;i--)
	   {
		   for(int j=8;j>=i;j--)
		   {
			   System.out.print(j);
		   }
	  System.out.println();
	}
}
}
}