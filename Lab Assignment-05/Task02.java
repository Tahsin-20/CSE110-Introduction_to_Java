import java.util.Scanner;
public class Task02{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("The value of N: ");
		int N=sc.nextInt();
		int x=1;
		int add=0;


		while(x<=N){
			
			int t=0;

			for(int j=1; j<=x; j++){
				t+=j;
			}
			add-=t;
			x++;
		}
		System.out.println("The value of y: "+add);
        sc.close();
	}
}
