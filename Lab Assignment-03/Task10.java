import java.util.Scanner;
public class Task10{
  public static void main(String[]args){
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1st no. : ");
    float num1=sc.nextFloat();
    System.out.println("Enter 2nd no. : ");
    float num2=sc.nextFloat();
    System.out.println("Enter 3rd no. : ");
    float num3=sc.nextFloat();

    if(num1>num2 && num1>num3){
      System.out.println("Maximum number is "+num1);
    }
    else if(num2>num1 && num2>num1){
      System.out.println("Maximum number is "+num2);
    }
    else{
      System.out.println("Maximum number is "+num3);
    }

    if (num1<num2 && num1<num3) {
      System.out.println("Minimum number is "+num1);
    }
    else if(num2<num1 && num2<num3){
      System.out.println("Minumum number is "+num2);
    }
    else{
      System.out.println("Minimum number is "+num3);
    }
    sc.close();
  }
}