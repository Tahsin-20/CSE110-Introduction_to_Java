public class Task07 {
    public static void main(String[] args){

    int mins=3456789;

    int totaldays=(mins/(60*24));

    int years= totaldays/365;

    int days= totaldays%365;

    System.out.println("3456789 minutes is approximately "+years+" years and "+days+" days");

	}
}
