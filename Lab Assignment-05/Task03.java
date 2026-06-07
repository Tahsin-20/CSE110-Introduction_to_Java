import java.util.Scanner;
public class Task03{
	public static void main(String[]args){

		Scanner sc=new Scanner (System.in);

		while(true){
			System.out.println("Enter Number");
			int a=sc.nextInt();
			if(a%2!=0){
				break;
			}
			int div=0;
			for(int i=1;i<=a; i++){
				if(a%i==0){
					div++;
				}
			}
			System.out.println(a+" has "+div+" divisors ");
		}
        sc.close();
	}
}