import java.util.Scanner;

public class Task03{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char split=sc.next().charAt(0);
		String temp="";

		for(int i=0; i<=str.length()-1; i++){

			char ch=str.charAt(i);

			if(split==ch){
				System.out.println(temp);
				temp="";
			}
			else{
			temp+=ch;
		    }
	    }
	    System.out.println(temp);
		sc.close();
    }
}