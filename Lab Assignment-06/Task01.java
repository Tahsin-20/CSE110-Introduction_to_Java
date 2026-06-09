import java.util.Scanner;
public class Task01{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String temp="";

		for(int i=0; i<line.length(); i++){
			char word=line.charAt(i);


			if(word>='a' && word<='z'){

				char c=(char)(word-32);
				temp+=c;
			}
			else{
				temp+=word;
			}
		}
		System.out.println(temp);
		sc.close();
	}
}