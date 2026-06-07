import java.util.Scanner;
public class Task09{
  public static void main(String[]args){
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter payment: ");
    int pay=sc.nextInt();
    System.out.println("Enter age: ");
    int age=sc.nextInt();


    if (pay<10000 || age<18) {
      System.out.println("Your tax amounts in 0 TK");
    }
    else if ((pay>=10000 && pay<=20000) && (age>=18)) {
      System.out.println("Your tax amounts in "+(pay*5)/100+" TK");
    }
    else{
      System.out.println("Your tax amounts in "+(pay*10)/100+" TK");
    }
    sc.close();
  }
}