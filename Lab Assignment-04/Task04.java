import java.util.Scanner;
public class Task04{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        
        System.out.println("Divisors of "+num+":");
        
        for(int i=1; i<=num; i++){
        	if(num%i==0 || i==num){
        		System.out.println(i);
        	}
        }
        sc.close();
	}
}
