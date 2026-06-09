import java.util.Scanner;
public class Task06{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String ln=sc.nextLine();
		
		String t1="";
		String t2="";
		ln=ln+" ";

		for(int i=0; i<ln.length(); i++ ){

			char wd=ln.charAt(i);

			if(wd!=' '){
				
				t1+=wd;
			}

			else{
				 	 
				 	 t2=t1+" "+t2;
				 	 t1=""; 
				}
		}
		
		System.out.println(t2);
		sc.close(); 
    }
}