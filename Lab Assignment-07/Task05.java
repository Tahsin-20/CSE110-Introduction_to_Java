import java.util.Scanner;

public class Task05{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("N = ");
		int n=sc.nextInt();

		int [] arr=new int[n];

		for(int i=0; i<arr.length; i++){
			System.out.print("Enter a number:");
			int a=sc.nextInt();
			arr[i]=a;
		}
		int b=sc.nextInt();
		boolean bool=false;
		int ind=0;

		for(int j=0; j<arr.length; j++){

			if(arr[j]==b){
				bool=true;
				ind=j;
				break;
			}
		}
		if(bool==true){
			System.out.println(b+" is at index "+ind);
		}
		else{
			System.out.println("Element not found");
		}
		sc.close();
	}
}