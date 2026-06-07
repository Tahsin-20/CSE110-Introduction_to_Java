import java.util.Scanner;
public class Task12{
  public static void main(String[]args){
    
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the amount the customer needs to pay(Taka) ");
    int c_pay=sc.nextInt();
    System.out.print("Enter the amount, customer gave(Taka) ");
    int c_gave=sc.nextInt();

    int chng=c_gave-c_pay;

    if (chng==0) {
      System.out.println("The returned amount is 0 taka");      
    }

    else if (c_pay>c_gave) {
      int extra=c_pay-c_gave;
      System.out.println("Please pay "+ extra +" taka more");
    }
    
    else{
      int hundred=chng/100;
      int c1=chng%100;

      int fifty=c1/50;
      int c2=c1%50;

      int twenty=c2/20;
      int c3=c2%20;

      int ten=c3/10;
      int c4=c3%10;

      int five=c4/5;
      int c5=c4%5;

      int two=c5/2;
      int c6=c5%2;

      int one=c6/1;

      
      System.out.println("The returned amount is "+chng+" taka.");
      System.out.println("100 taka note: "+hundred);
      System.out.println("50 taka note: "+fifty);
      System.out.println("20 taka note: "+twenty);
      System.out.println("10 taka note: "+ten);
      System.out.println("5 taka coin: "+five);
      System.out.println("2 taka coin: "+two);
      System.out.println("1 taka coin: "+one);
      }
      sc.close();
    }
  }
