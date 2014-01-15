/*Assignment: Write a program that asks the user to input their
 * name and displays it togheter with current date and time.*/



import java.util.GregorianCalendar;
import java.util.Scanner;

public class JensenUppgift2 {
	
	public static void main(String[] args)
	{
		GregorianCalendar date = new GregorianCalendar();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ange ditt namn.");
		
		String namn = scanner.next();

		System.out.println("Välkommen, " + namn + "!");
		System.out.println("Datum och tid: " + date.getTime());
		scanner.close();
	}
}
