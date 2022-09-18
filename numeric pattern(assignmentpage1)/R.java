class R{
public static void main(String args[])
{
	int alphabet=65;
  for(int i=5;i>=1;i--) //row
  {
    for(int j=0;j<i;j++) //col
	{
	  System.out.print((char)(alphabet+j)+" ");
	  }
	   
	  System.out.println();
	}
}
}
  