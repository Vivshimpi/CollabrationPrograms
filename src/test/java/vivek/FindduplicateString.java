package vivek;

public class FindduplicateString 
{
  public static void main(String[] args)
  {
	String s = "vivek";
	char [] a = s.toCharArray();
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
		}

	}
		
}
}
