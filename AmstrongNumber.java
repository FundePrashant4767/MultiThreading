package day1;
import java.util.Scanner;
class  AmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  The Number : ");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem*rem);
			temp=temp/10;
		}
		if(num==sum)
		{
			System.out.println("the given number is Amstrong number....!!");
		}
		else
		{
			System.out.println("The given Number is not Amstrong number...!!");
		}

	}
}
