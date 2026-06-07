import java.util.Scanner;
public class Task09{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int digit=x;
		int count=0;

		while(digit>0){
		    digit=digit/10;
		 	count++;

		}
		System.out.println("Total digits = "+count);
        sc.close();
	}
}