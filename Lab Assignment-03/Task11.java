import java.util.Scanner;
public class Task11{
  public static void main(String[]args){
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Side 1: ");
    int side1=sc.nextInt();
    System.out.println("Enter Side 2: ");
    int side2=sc.nextInt();
    System.out.println("Enter Side 3: ");
    int side3=sc.nextInt();

    if (side1==side2 && side2==side3) {
      System.out.println("This is a Equilateral triangle");
    }
    else if((side1==side2 || side2==side3) || (side1==side3)){
      System.out.println("This is a Isosceles triangle");
    }
    else{
      System.out.println("This is a Scalene triangle");
    }
    sc.close();
  }
}