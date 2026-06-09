import java.util.Scanner;

public class Task08{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean bool=true;

		for(int i=0; i<str.length(); i++){

			char charc=str.charAt(i);

			if(charc>='A' && charc<='Z'){

				if(bool==true){
					System.out.print((char)(charc+32));
					bool=false;
				}
				else{
					System.out.print(charc);
					bool=true;
				}
			}

		else if(charc>='a' && charc<='z'){

			if(bool==false){
				System.out.print((char)(charc-32));
				bool=true;
			}
			else{
				System.out.print(charc);
				bool=false;
			}
		}
		
		else{
			System.out.print(charc);
		}

	    }
		sc.close();
	}
}
