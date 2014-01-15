/*
  Assignment:
  
  Write a program that reads data on a number of people,
  and calculates the average age for women and men in the group.

  Follow the following structure diagram (flowchart) carefully!

*/


//Importera de klasser programmet beh�ver fr�n java standard klass biblioteket.
import java.util.Scanner;

public class JensenUppgift9 {
	
	/*
	 * main metoden anropas av JVM. Keyword public anv�nds f�r att den ska kunna anropas fr�n vartifr�n som helst
	 * i programmet, static f�r att JVM inte ska beh�va instantiera klassen som inneh�ller main metoden utan
	 * kunna anropa den direkt och void f�r att metoden inte returnerar n�got v�rde.
	 * */
	public static void main(String[] args)
	{
		//Instansiera ett nytt object fr�n klassen scanner som anv�nds f�r att l�sa in data.
		Scanner scanner = new Scanner(System.in);
		
		//Initialisera fyra variabler som vi beh�ver. M�ste initialisera f�r att kunna anv�ndas i programmet.
		int A1 = 0; //Variabel som representerar antal m�n.
		int A2 = 0; // Variabel som representerar antal kvinnor.
		double G1 = 0; // Variabel d�r summan av �lder f�r m�n samlas.
		double G2 = 0; // Variabel d�r summan av �lder f�r kvinnor samlas.
		
		//Informerar anv�ndaren vad programmet g�r ut p�.
		System.out.println("Hej. Detta program kommer ber�kna genomsnitts�ldern f�r m�n och kvinnor");
		
		//While loop som itererar kod sekvensen innuti. Vi har angiviget keyword true som villkor vilket
		//inneb�r att programmet kommer att iterera o�ndligt tills man bryter det manuellt genom
		//att anv�nda keyword break.
		while(true)
		{
			//Skriv ut ytterligare instruktioner och l�sa in v�rden.
			System.out.println("Mata in k�n. 1 = Man, 0 = Kvinna");
			int val = scanner.nextInt();
			
			//Selektion som hanterar det inmatade v�rdet.
			if(val == 1)
			{
				A1++; //Inkrementerar antal m�n.
				System.out.println("Hur gammal �r han?");
				G1 += scanner.nextInt(); //l�ser in inmatning av data och addera det samtidigt till G1. 
			}
			else
			{
				A2++; //Inkrementerar antal kvinnor.
				System.out.println("Hur gammal �r hon?");
				G2 += scanner.nextInt(); //l�ser in inmatning av data och addera det samtidigt till G2.
			}
			//Sekvens av kod som fr�gar anv�ndaren om hen vill l�gga till en person eller avsluta
			//programmet och skriva ut resultatet.
			System.out.println("Vill du l�gga till fler personer? 1 = Ja, 0 = Nej");
			val = scanner.nextInt(); 
			if(val == 1)
				continue; // Keyword som g�r s� att while loopen b�rjar fr�n b�rjan
			else
				break; // Bryter while loopen
		}
		
		double M1 = G1 / A1; //Ber�kna genomsnitts�lder f�r m�n och skriv ut informativt meddelande.
		System.out.println("Antal m�n: " + A1 + ". Deras genomsnitts�lder: " + Math.round(M1));
		double M2 = G2 / A2; //Ber�kna genomsnitts�lder f�r kvinnor och skriv ut informativt meddelande.
		System.out.println("Antal kvinnor: " + A2 + ". Deras genomsnitts�lder: " + Math.round(M2));
		
		scanner.close();
	}

}
