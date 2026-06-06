public class Task13 {
    public static void main(String[] args){

		double hour=5;
		double min=56;
		double sec=23;
		double student_id=1099;

		double time=(hour+(min/60)+(sec/3600));

		double kmph=(student_id/1000)/time;

		double mph=(student_id/1609)/time;

		System.out.println("Your velocity in km/h is "+kmph);
		System.out.println("Your velocity in miles/h is "+mph);     
	}
}
