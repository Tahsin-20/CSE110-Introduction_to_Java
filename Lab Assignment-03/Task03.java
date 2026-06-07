import java.util.Scanner;
public class Task03{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num1 = sc.nextInt();
    System.out.println("Enter another number:");
    int num2 = sc.nextInt();
    System.out.println("Enter a sign:");
    String operator= sc.next();

    //Use.equals() method to compare two strings

    if (operator.equals("+")) {
      System.out.println(num1+num2);
    }
    else if(operator.equals("-")){
      System.out.println(num1-num2);
    }
    else if (operator.equals("*")) {
      System.out.println(num1*num2);
      }
    else if(operator.equals("/")){
      System.out.println(num1/num2);
    }
    sc.close();
  }
}