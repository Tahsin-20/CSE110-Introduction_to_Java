import java.util.Scanner;
public class Task10{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
        int y=x;
		int j=0;

		while(true){
			x=x/10;
			j++;

			if(x==0){
				break;
			}
		}
		
		for(int b=(int)Math.pow(10,j-1); b>0; b=b/10){
			int k=y/b;
            y=y%b;
		
		if(b>0){
			System.out.print(k+", ");
		}
		else if(b==0){
			System.out.print(k);
		}

	}
    sc.close();

	}
}