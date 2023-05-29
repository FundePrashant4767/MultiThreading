package day1;
import java.util.Scanner;
class  Prime
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int count=0;
		int rem=0;
		int res=0;
		while(num>0)
		{
			rem = num%10;
		for(int i=1;i<=num;i++)
		{
            
			if(rem%i==0)
			{

				count++;
			}
			num=num/10;
				
			 if(count==2)
			{
					
              count++;
			}
		}
System.out.println(count);
		}
		}
}

