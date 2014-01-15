/*
 Assignment:
 
 Write a program that reads 10 words, separated by Enter (return) from the command window.
 Then write out the words in reverse order in the command window.

 Attention, Important! Input and output should not be done via dialog boxes.

 To get the VN, you must use a for loop!
*/

//Det paket classen befinner sig i. Måste deklareras


//Importera de klasser programmer behöver från java biblioteket java.util.
import java.util.Scanner;

//Deklaration av classens namn och access modifier. Enbart class med filens namn kan vara public.
public class JensenUppgift7 {
	
	/*
	 * main metoden anropas av JVM. Keyword public används för att den ska kunna anropas från vartifrån som helst
	 * i programmet, static för att JVM inte ska behöva instantiera klassen som innehåller main metoden utan
	 * kunna anropa den direkt och void för att metoden inte returnerar något värde.
	 * 
	 * */
	
	public static void main(String[] args)
	{
		//Instansiera ett nytt object från klassen scanner som används för att läsa in data.
		Scanner scanner = new Scanner(System.in);
		
		//Initialisera en array av datatypen String som har 100 element.
		String[] ord = new String[10];
		
		//Skriv ut en utförlig presentation om vad som förväntas av användaren och resultatet.
		System.out.println("Hej och välkommen till mitt program. Det här programmet" +
				" kommer fråga dig att mata in ord som du väljer och sedan skriva " + 
				"ut de i omvänd ordning.");
		
		//for loop som itererar ord.length antal gånger. Alltså så länge den inte gått igenom alla
		//element som finns i ord arrayn.
		for(int x = 0; x < ord.length; x++)
		{
			//Ytterligare information och hantering av inmatning. Anropar next() i objektet scanner.
			System.out.println("Skriv ett ord. Avsluta programmet genom att skriva 'Sluta'");
			String indata = scanner.next();
			
			/*Selektion med ett villkor som anropar compareTo metoden vilken är instance metod i
				klassen String och
				kan därför kommas åt genom indata.compareTo(). Om värdet som returneras är lika med 0
				så har argumentet och det som matats in av användaren lika.
			*/
			if(indata.compareTo("Sluta") == 0 || x == ord.length - 1)
			{
				if(x == ord.length - 1) ord[x] = indata;
				//Om värdet skapar vi en ny forloop med startpunkt i slutet av arrayn.
				for(int i = x; i >= 0; i--)
					//Sista iterationen är värdet på i 0 och vi avslutar meningen med punkt.
					if(i == 0)
						System.out.print(ord[i] + ".");
					else
						System.out.print(ord[i] + ", ");
				break;
			}
			else
				//Om villkoret i if parantesen inte stämmer så lägger vi till ordet i String arrayn.
				ord[x] = indata;
		}
		scanner.close();
	}
}
