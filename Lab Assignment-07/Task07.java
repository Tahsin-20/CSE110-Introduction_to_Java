public class Task07{
	public static void main(String[]args){

		int [] arr1={23,100,23,56,100};
		int [] arr2 = {-5,10,-7,-5};

		System.out.println("Input array: ");

		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}

		for(int j=0; j<arr1.length; j++){
			for(int k=j+1; k<arr1.length; k++){
				if(arr1[j]==arr1[k]){
					arr1[k]=0;
				}
			}
		}
		int count=0;

	    for(int l=0; l<arr1.length; l++){
			if(arr1[l]!=0){
				count++;
			}
		}
		int [] new_arr=new int [count];

		int ind=0;

		for(int p=0; p<arr1.length; p++){
			if(arr1[p]!=0){
				new_arr[ind]=arr1[p];
				ind++;
			}
		}
		System.out.println();
		System.out.println("New array: ");
		
		for(int o=0; o<new_arr.length; o++){
			System.out.print(new_arr[o]+" ");
		}

		System.out.println("\n");
		System.out.println("Input array: ");

		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}

		for(int j=0; j<arr2.length; j++){
			for(int k=j+1; k<arr2.length; k++){
				if(arr2[j]==arr2[k]){
					arr2[k]=0;
				}
			}
		}
		int count1=0;

	    for(int l=0; l<arr2.length; l++){
			if(arr2[l]!=0){
				count1++;
			}
		}
		int [] new_arr1=new int [count1];

		int ind1=0;

		for(int p=0; p<arr2.length; p++){
			if(arr2[p]!=0){
				new_arr1[ind1]=arr2[p];
				ind1++;
			}
		}
		System.out.println();
		System.out.println("New array: ");
		
		for(int o=0; o<new_arr1.length; o++){
			System.out.print(new_arr1[o]+" ");
		}
	}
}
