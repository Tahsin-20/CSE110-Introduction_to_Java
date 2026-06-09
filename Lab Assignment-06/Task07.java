import java.util.Scanner;

public class Task07{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String first_str=sc.nextLine();
		String second_str=sc.nextLine();
		String not_com="";

		boolean bool=false;

		for(int i=0; i<first_str.length(); i++){

			for(int j=0; j<second_str.length(); j++){

				if(first_str.charAt(i)==second_str.charAt(j)){
					bool=true;
				}
			}
			if(bool==false){
				not_com+=first_str.charAt(i);
			}
        	bool=false;
        }

        for(int m=0; m<second_str.length(); m++){

			for(int n=0; n<first_str.length(); n++){

				if(second_str.charAt(m)==first_str.charAt(n)){
					bool=true;
				}
			}
			if(bool==false){
				not_com+=second_str.charAt(m);
			}
        	bool=false;
        }
        System.out.println(not_com.toUpperCase());
		sc.close();
	}
}