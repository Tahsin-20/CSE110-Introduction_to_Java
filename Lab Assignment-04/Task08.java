import java.util.Scanner;
public class Task08{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int x=0;

		while(x<=a){
			if(x%5==0 && x%3!=0){
				System.out.println(x);
			}
			
			x++;
		}
        sc.close();
	}
}