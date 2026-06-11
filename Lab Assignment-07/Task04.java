import java.util.Scanner;
public class Task04{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("N = ");
		int n=sc.nextInt();

		int [] arr=new int[n];

		for(int i=0; i<arr.length; i++){
			int a=sc.nextInt();
			arr[i]=a;
		}

		System.out.println("Original array:");

		for(int k=0; k<arr.length; k++){
			System.out.print(arr[k]+" ");
		}

		for(int j=0; j<arr.length; j++){
			if(arr[j]>0){
				arr[j]=1;
			}
			else if(arr[j]<0){
				arr[j]=0;
			}
		}

		System.out.println();
		System.out.println("After modifying:");

		for(int l=0; l<arr.length; l++){
			System.out.print(arr[l]+" ");
		}
		sc.close();
	}
}