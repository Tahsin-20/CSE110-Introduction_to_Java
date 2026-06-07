import java.util.Scanner;
public class Task08{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Start: ");
		int start=sc.nextInt();
		System.out.println("End: ");
		int end=sc.nextInt();
		System.out.println("Armstrong numbers:");

		for(int i=start; i<=end; i++){
			int num=i;
			int d=0;

			while(num!=0){
				num/=10;
				d++;
			}

			int num2=0;
			int sum=0;
			num=i;

			while(num!=0){
				num2=num%10;
				sum=sum+(int)(Math.pow(num2,d));
				num/=10;
			}
			if(sum==i){
				System.out.println(sum);
			}
		}
        sc.close();
	}
}