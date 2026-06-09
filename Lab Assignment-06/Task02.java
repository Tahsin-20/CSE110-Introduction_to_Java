import java.util.Scanner;
public class Task02{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String temp="";

		for(int i=line.length()-1; i>=0; i--){
			char word=line.charAt(i);
			temp+=word;
			}
			if(temp.equals(line)){
			   System.out.println("true");
		    }
		    else{
		       System.out.println("false");
		    }
			sc.close();
		}
	}