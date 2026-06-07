import java.util.Scanner;
public class Task02{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a mark: ");
    int marks = sc.nextInt();
    
    if(marks>=90 && marks<=100){
      System.out.println("A");
    }
    else if (marks>=85 && marks<=89){
      System.out.println("A-");
    }
    else if (marks>=70 && marks<=84){
      System.out.println("B");
    }
    else if (marks>=57 && marks<=69){
      System.out.println("C");
    }
    else if (marks>=50 && marks<=56){
      System.out.println("D");
    }
    else{
      System.out.println("F");
    }
    sc.close();
  }
}