import java.util.Scanner;

public class Task01{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("N = ");
		int n=sc.nextInt();

		int [] arr=new int[n];

		for(int i=0; i<n; i++){
			System.out.print("Enter a number: ");
			int a=sc.nextInt();
			arr[i]=a;
		}

		for(int j=0; j<arr.length; j++){
			System.out.println(j+":"+ arr[j]);
		}

		int [] new_arr=new int[n+1];
		
		System.out.print("Enter other number: ");
		int b=sc.nextInt();
		new_arr[n]=b;

		System.out.println("After resizing the array: ");

		for(int k=0; k<arr.length; k++){
			new_arr[k]=arr[k];
		}

		for(int l=0; l<new_arr.length; l++){
			System.out.print(new_arr[l]+" ");
		}
		sc.close();
	}
}
