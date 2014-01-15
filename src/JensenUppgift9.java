/*
  Assignment:
  
  Write a program that reads data on a number of people,
  and calculates the average age for women and men in the group.

  Follow the following structure diagram (flowchart) carefully!

*/


//Importera de klasser programmet behöver från java standard klass biblioteket.
import java.util.Scanner;

public class JensenUppgift9 {
	
	/*
	 * main metoden anropas av JVM. Keyword public används för att den ska kunna anropas från vartifrån som helst
	 * i programmet, static för att JVM inte ska behöva instantiera klassen som innehåller main metoden utan
	 * kunna anropa den direkt och void för att metoden inte returnerar något värde.
	 * */
	public static void main(String[] args)
	{
		//Instansiera ett nytt object från klassen scanner som används för att läsa in data.
		Scanner scanner = new Scanner(System.in);
		
		//Initialisera fyra variabler som vi behöver. Måste initialisera för att kunna användas i programmet.
		int A1 = 0; //Variabel som representerar antal män.
		int A2 = 0; // Variabel som representerar antal kvinnor.
		double G1 = 0; // Variabel där summan av ålder för män samlas.
		double G2 = 0; // Variabel där summan av ålder för kvinnor samlas.
		
		//Informerar användaren vad programmet går ut på.
		System.out.println("Hej. Detta program kommer beräkna genomsnittsåldern för män och kvinnor");
		
		//While loop som itererar kod sekvensen innuti. Vi har angiviget keyword true som villkor vilket
		//innebär att programmet kommer att iterera oändligt tills man bryter det manuellt genom
		//att använda keyword break.
		while(true)
		{
			//Skriv ut ytterligare instruktioner och läsa in värden.
			System.out.println("Mata in kön. 1 = Man, 0 = Kvinna");
			int val = scanner.nextInt();
			
			//Selektion som hanterar det inmatade värdet.
			if(val == 1)
			{
				A1++; //Inkrementerar antal män.
				System.out.println("Hur gammal är han?");
				G1 += scanner.nextInt(); //läser in inmatning av data och addera det samtidigt till G1. 
			}
			else
			{
				A2++; //Inkrementerar antal kvinnor.
				System.out.println("Hur gammal är hon?");
				G2 += scanner.nextInt(); //läser in inmatning av data och addera det samtidigt till G2.
			}
			//Sekvens av kod som frågar användaren om hen vill lägga till en person eller avsluta
			//programmet och skriva ut resultatet.
			System.out.println("Vill du lägga till fler personer? 1 = Ja, 0 = Nej");
			val = scanner.nextInt(); 
			if(val == 1)
				continue; // Keyword som gör så att while loopen börjar från början
			else
				break; // Bryter while loopen
		}
		
		double M1 = G1 / A1; //Beräkna genomsnittsålder för män och skriv ut informativt meddelande.
		System.out.println("Antal män: " + A1 + ". Deras genomsnittsålder: " + Math.round(M1));
		double M2 = G2 / A2; //Beräkna genomsnittsålder för kvinnor och skriv ut informativt meddelande.
		System.out.println("Antal kvinnor: " + A2 + ". Deras genomsnittsålder: " + Math.round(M2));
		
		scanner.close();
	}

}
