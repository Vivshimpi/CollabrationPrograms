package vivek;

public class SecondMaxArray 
{
	public static void main(String[] args)
	{
		int [] a = {1,3,2,4};
		int largest = 0;//4
		int secondl = 0;//3


		for(int i=0; i<a.length; i++)
		{

			if(a[i]>largest) //loop1=3>0 /loop2=f/loop3=f/loop4=4>3
			{
				secondl = largest;//loop1 secondl=0/loop4 secondl=3
				largest = a[i];//loop1 largest=3/ loop4 largest=4
			}
			          //3             //4
			if(a[i]>=secondl && a[i]<largest)
			{
				secondl = a[i];//3
			}

		}


		System.out.println("Second largest Number is: " + secondl);
	}
}
