import java.util.Scanner;
public class Task02{
	public static void main(String[]args){
		int N;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the 5 numbers: ");
		N=sc.nextInt();
        
        int a;

        int sum=0;

		for(int i=0; i<N; i++){
			a=sc.nextInt();
			sum=sum+a;
		}
		double avg=sum/N;
		System.out.println("The sum of 5 no is: "+sum);
		System.out.println("The Average is: "+avg);

        sc.close();
	}
}