class M{
public static void main(String args[])
{
	int alphabet=64;
  for(int i=1;i<=5;i++) //row
  {
    for(int j=5;j>i;j--) //col
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
	  System.out.print((char)(alphabet+i)+" ");
	  }
	   
	  System.out.println();
	}
}
}
  