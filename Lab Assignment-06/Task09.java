import java.util.Scanner;

public class Task09{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String pass=sc.nextLine();
		int count=0;
		
		boolean bool1=false;
		boolean bool2=false;
		boolean bool3=false;
		boolean bool4=false;

		for(int i=0; i<pass.length(); i++){

			char charc=pass.charAt(i);

			if(charc>='A' && charc<='Z'){
				bool1=true;
				count++;
			}
			else if(charc>='a' && charc<='z'){
				bool2=true;
				count++;
			}
			else if(charc>='0' && charc<='9'){
				bool3=true;
				count++;
			}
			else{
				bool4=true;
				count++;
			}
			
		}

		if((count>=8) && (bool1==true && bool2==true && bool3==true && bool4==true)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
        sc.close();
	}
}