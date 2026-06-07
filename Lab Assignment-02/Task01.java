import java.util.Scanner;

public class Task01 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1st no. : ");
    int num1=sc.nextInt();
    System.out.println("Enter 2nd no. : ");
    int num2=sc.nextInt();
    System.out.println("Enter 3rd no. : ");
    int num3=sc.nextInt();

    if(num1>num2 && num1>num3){
      System.out.println("largest number: "+num1);
    }
    else if(num2>num1 && num2>num3){
      System.out.println("largest number: "+num2);
    }
    else{
      System.out.println("largest number: "+num3);
    }
    sc.close();
  }
}
