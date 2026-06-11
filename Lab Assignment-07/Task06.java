import java.util.Scanner;
public class Task06{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n=sc.nextInt();

		double [] arr=new double[n];

		for(int i=0; i<arr.length; i++){
			System.out.print("Enter a number: ");
			double a=sc.nextDouble();
			arr[i]=a;
		}

		double maxi=arr[0];
		int maxi_ind=0;
		double mini=arr[0];
		int mini_ind=0;
		double sum=0.0;
		double avg=0.0;

		for(int j=0; j<arr.length; j++){
			sum=sum+arr[j];

			if(arr[j]>maxi){
				maxi=arr[j];
				maxi_ind=j;
			}

			if(arr[j]<mini){
				mini=arr[j];
				mini_ind=j;
			}
		}

		avg=sum/n;

		System.out.printf("Maximum element %.1f is found at index %d\n",maxi,maxi_ind);
		System.out.printf("Minimum element %.1f is found at index %d\n",mini,mini_ind);

		System.out.printf("Summation: %.1f\n",sum);
		System.out.printf("Average: %.2f\n",avg);

		sc.close();

	}

}