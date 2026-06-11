import java.util.Scanner;
public class Task03{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int x=sc.nextInt();

		int [] arr=new int[x];
		int [] new_arr=new int[x];

		for(int i=0; i<x; i++){
			System.out.print("Enter a number:");
			int y=sc.nextInt();
			arr[i]=y;
		}

		for(int j=0; j<arr.length; j++){
			new_arr[arr.length-1-j]=arr[j];
		}

		System.out.println("Reversed using a new array:");

		for(int k=0; k<new_arr.length; k++){
			System.out.print(new_arr[k]+ " ");
		}

		for(int i=0, j=arr.length-1;i<=j; i++,j--){
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		System.out.println("\n");
		System.out.println("Reversed the original array:");
		for(int l=0; l<arr.length; l++){
			System.out.print(arr[l]+" ");
		}
		sc.close();
	}
}
