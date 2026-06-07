import java.util.Scanner;
public class Task08{
  public static void main(String[]args){
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a Student ID:");
    int student_id= sc.nextInt();
    int year=(student_id/1000000);

    if((student_id/100000)%10==1){
      System.out.println("Student Joined BRAC in Spring "+year);
    }
    else if ((student_id/100000)%10==2) {
      System.out.println("Student Joined BRAC in Fall "+year);
    }
    else if ((student_id/100000)%10==3) {
      System.out.println("Student Joined BRAC in Summer "+year);
    }
    sc.close();
  }
}