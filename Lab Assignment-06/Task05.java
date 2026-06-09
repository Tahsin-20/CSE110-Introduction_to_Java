import java.util.Scanner;
public class Task05{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String ln=sc.nextLine();
		String ln1=ln.toUpperCase();
		
		int vow=0;
		int con=0;
		

		for(int i=0; i<ln1.length(); i++){

			char wd=ln1.charAt(i);

		  if(wd>='A' && wd<='Z'){

			if(wd=='A' || wd=='E' || wd=='I' || wd=='O' || wd=='U'){
				vow++;
			}
			else{
				con++;
			}
		  }
		}

		if(vow>0 && con>0 && vow%3==0 && con%5==0){
			System.out.println("Aaarr! Me Plunder!!");
		}
		else{
			System.out.println("Blimey! No Plunder!!");
		}
		sc.close();
	}
}	
