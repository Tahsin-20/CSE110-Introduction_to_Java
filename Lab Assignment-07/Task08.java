import java.util.Scanner;
public class Task08{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the length of array 1: ");
		int a=sc.nextInt();

		int [] arr1=new int [a];
		System.out.println("Please enter the elements of arr1:");

		for(int i=0; i<arr1.length; i++){
			int b=sc.nextInt();
			arr1[i]=b; 
		}

		System.out.print("Please enter the length of array 2: ");
		int c=sc.nextInt();

		int [] arr2=new int[c];
		System.out.println("Please enter the elements of the arr2: ");

		for(int i=0; i<arr2.length; i++){
			int d=sc.nextInt();
			arr2[i]=d;
		}
		boolean bool_subset=true;

		for(int i=0; i<arr2.length; i++){

		    boolean bool=false;

			for(int j=0; j<arr1.length; j++){

				if(arr2[i]==arr1[j]){
					bool=true;
				}
			}
			if(bool==false){
				bool_subset=false;
			}	
		}

		if(bool_subset==true){
			System.out.println("Array 2 is a subset of Array 1.");
		}
		else{
			System.out.println("Array 2 is not a subset of Array 1.");
		}

		sc.close();
	}
}