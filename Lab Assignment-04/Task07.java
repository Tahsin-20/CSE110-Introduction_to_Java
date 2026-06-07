import java.util.Scanner;
public class Task07{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
        int a;
		int x=0;
		int sum=0;

		while(x<10){
			System.out.println("Enter Number: ");
			a=sc.nextInt();
			sum=sum+a;
			System.out.println("Sum = "+sum);
            x++;
		}
        sc.close();
	}
}
