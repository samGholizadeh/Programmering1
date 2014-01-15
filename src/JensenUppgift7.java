/*
 Assignment:
 
 Write a program that reads 10 words, separated by Enter (return) from the command window.
 Then write out the words in reverse order in the command window.

 Attention, Important! Input and output should not be done via dialog boxes.

 To get the VN, you must use a for loop!
*/

//Det paket classen befinner sig i. M�ste deklareras


//Importera de klasser programmer beh�ver fr�n java biblioteket java.util.
import java.util.Scanner;

//Deklaration av classens namn och access modifier. Enbart class med filens namn kan vara public.
public class JensenUppgift7 {
	
	/*
	 * main metoden anropas av JVM. Keyword public anv�nds f�r att den ska kunna anropas fr�n vartifr�n som helst
	 * i programmet, static f�r att JVM inte ska beh�va instantiera klassen som inneh�ller main metoden utan
	 * kunna anropa den direkt och void f�r att metoden inte returnerar n�got v�rde.
	 * 
	 * */
	
	public static void main(String[] args)
	{
		//Instansiera ett nytt object fr�n klassen scanner som anv�nds f�r att l�sa in data.
		Scanner scanner = new Scanner(System.in);
		
		//Initialisera en array av datatypen String som har 100 element.
		String[] ord = new String[10];
		
		//Skriv ut en utf�rlig presentation om vad som f�rv�ntas av anv�ndaren och resultatet.
		System.out.println("Hej och v�lkommen till mitt program. Det h�r programmet" +
				" kommer fr�ga dig att mata in ord som du v�ljer och sedan skriva " + 
				"ut de i omv�nd ordning.");
		
		//for loop som itererar ord.length antal g�nger. Allts� s� l�nge den inte g�tt igenom alla
		//element som finns i ord arrayn.
		for(int x = 0; x < ord.length; x++)
		{
			//Ytterligare information och hantering av inmatning. Anropar next() i objektet scanner.
			System.out.println("Skriv ett ord. Avsluta programmet genom att skriva 'Sluta'");
			String indata = scanner.next();
			
			/*Selektion med ett villkor som anropar compareTo metoden vilken �r instance metod i
				klassen String och
				kan d�rf�r kommas �t genom indata.compareTo(). Om v�rdet som returneras �r lika med 0
				s� har argumentet och det som matats in av anv�ndaren lika.
			*/
			if(indata.compareTo("Sluta") == 0 || x == ord.length - 1)
			{
				if(x == ord.length - 1) ord[x] = indata;
				//Om v�rdet skapar vi en ny forloop med startpunkt i slutet av arrayn.
				for(int i = x; i >= 0; i--)
					//Sista iterationen �r v�rdet p� i 0 och vi avslutar meningen med punkt.
					if(i == 0)
						System.out.print(ord[i] + ".");
					else
						System.out.print(ord[i] + ", ");
				break;
			}
			else
				//Om villkoret i if parantesen inte st�mmer s� l�gger vi till ordet i String arrayn.
				ord[x] = indata;
		}
		scanner.close();
	}
}
