import java.util.Scanner;
public class Task11{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num=sc.nextInt();

		boolean prime=true;
		int sum=1;
		for(int i=2; i<=num-1; i++){

			if(num%i==0){
				prime=false;
				sum+=i;
			}
		}
		if(prime==true){
			System.out.println(num+" is a prime number");
		}
		else{
			System.out.println(num+" is not a prime number");
		}
		if(sum==num){
			System.out.println(num+" is a perfect number");
		}
		else{
			System.out.println(num+" is not a perfect number");
		}
        sc.close();
	}
}
