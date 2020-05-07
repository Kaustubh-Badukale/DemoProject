package test;

public class prime10to50 
{

	public static void main(String []args)
	{
		int a;
		for(a=10;a<=50;a++)
		{   
			int b=0;
			for(int i=2;i<=a/2;i++)
			{
				if(a%i == 0)
				{
					b++;
					break;
				}
			}
			if(b==0)
			{
				System.out.print(a+" ");
			}
		}
	}
}
