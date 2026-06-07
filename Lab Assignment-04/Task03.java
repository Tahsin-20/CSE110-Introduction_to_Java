import java.util.Scanner;
public class Task03{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
        int x;
		while(true){
			x=sc.nextInt();
			if(x>0){
				System.out.println(x*x);
			}

			else{
				break;
			}
		}
        sc.close();
	}
}