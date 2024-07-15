package vivek;

public class PrimeNumber
{
public static void main(String[] args)
{
  int num = 4;
  
  int temp =0;
  for(int i=2; i<num; i++)
  {
	 if(num%i==0)
	 {
		 temp++;
	 }
  }
  if(temp==0)
  {
	  System.out.println("prime");
  }
  else
  {
	  System.out.println("not prime");
  }

}
}
