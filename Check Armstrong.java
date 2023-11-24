import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);

		int n= sc.nextInt();
		int length=0,temp=n;
		while(temp!=0)
		{
			length++;
			temp/=10;
		}
		temp=n;
		int sum=0;
		while(temp!=0){
			sum+=Math.pow(temp%10, length);
			temp/=10;
		}

		if(sum==n)
		System.out.println("true");
		else
		System.out.println("false");

	}
}
