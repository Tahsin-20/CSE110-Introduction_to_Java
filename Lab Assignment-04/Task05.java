import java.util.Scanner;
public class Task05{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int counter=sc.nextInt();

        int pos_count=0;
        int neg_count=0;

        for(int i=1; i<=counter; i++){
        	System.out.println("Enter number "+i+" :");
        	int num=sc.nextInt();
        	if(num>=0){
        		pos_count+=1;
        	}
        	else{
        		neg_count+=1;
        	}
        }
        System.out.println(pos_count+" Non-negative Numbers");
        System.out.println(neg_count+" Negative numbers");
        sc.close();
	}
}
