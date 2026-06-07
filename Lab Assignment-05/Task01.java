import java.util.Scanner;
public class Task01{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int pc=0;
		int num=2;

		while(pc<x){
			int dc=0;

			for(int i=1; i<=num; i++){
				if(num%i==0){
					dc++;
				}

			}
			if(dc==2){
				System.out.println(num);
				pc++;
			}
			num++;
		}
        sc.close();
	}
}