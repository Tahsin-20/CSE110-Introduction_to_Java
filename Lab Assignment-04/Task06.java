import java.util.Scanner;
public class Task06{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of terms: ");
		int num=sc.nextInt();

		int x=0;
        int sum=0;
        int j=1;
        System.out.println("The odd numbers are: ");
		while(x<num){
			sum=sum+j;
			System.out.println(j);
			j=j+2;
			x++;
		}
		
		System.out.println("The Sum of odd Natural Numbers up to "+num+" terms is: "+sum);
        sc.close();
	}
}