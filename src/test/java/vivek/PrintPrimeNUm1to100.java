package vivek;

public class PrintPrimeNUm1to100
{
	public static void main(String[] args) 
	{
  

  for(int i=0; i<=100; i++)
  {
	 int count = 0;
	  
	  for(int j=1; j<=100; j++)
	  {
		  if(i%j==0)
		  {
		  count++;
		  }
	  }
	  if(count==2)
	  {
		  System.out.println(i);
	  }
  }
  
 
}}
