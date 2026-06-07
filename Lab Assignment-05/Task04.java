import java.util.Scanner;
public class Task04{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int num=0;

		while(num<a){
			int x=sc.nextInt();
			int y=sc.nextInt();

			if(x%2==0){
				x+=1;
			}
			else{
				x+=0;
			}
			int sum=0;
			for(int i=1;i<=y;i++){
				sum+=x;
				x+=2;
			}
			num++;
			System.out.println(sum);
		}
        sc.close();
	}
}
