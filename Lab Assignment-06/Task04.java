import java.util.Scanner;
public class Task04{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String temp="";

		for(int i=line.length()-1; i>=0; i--){

			char wd=line.charAt(i);
			temp+=wd;

		}
		System.out.println(temp);
		sc.close();
	}
}