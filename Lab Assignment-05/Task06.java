import java.util.Scanner;
public class Task06{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();

		for(int i=1; i<=h; i++){
			for(int j=1; j<=h-i; j++){
				System.out.print(" ");
			}
			
			for(int l=1; l<=i; l++){
				System.out.print(l);
			}
			System.out.println();
		}
        sc.close();
	}
}