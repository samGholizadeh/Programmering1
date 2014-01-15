/*
Assignment:

Create a program that calculates and prints a person's state income tax.

Read in the taxable income of the program.

The state tax is calculated as follows:

If income is less than (or equal to) 8900 SEK paid $ 0 in taxes.
If the income is greater than 8900 but less than SEK 198,700 SEK paid $ 100 in taxes.
If the income is greater than (or equal to) 198 700 SEK paid $ 100 + 20% of income over 198,700 kr.
Documenting the work of the Java file (comments in the source code).

To get the VN, you should also do the following:

The program will ask, and be able to calculate, if more persons income tax is calculated before it quits.*/



import java.util.Scanner;

public class JensenUppgift4 {
	
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		
		//Initialisera två variabler som vi behöver. Måste initialisera för att kunna använda i while-loopen.
		double statligSkatt = 0;
		int beskattningsbarInkomst = 0;
		
		//While loop som itererar kod sekvensen innuti. Vi har angiviget keyword true som villkor vilket
		//innebär att programmet kommer att iterera oändligt tills man bryter det manuellt genom
		//att använda keyword break.
		while(true)
		{
			//Informera användaren om vad programmet handlar om.
			System.out.println("Hej och välkommen till mitt sofistikerade skattberäknings program");
			System.out.println("Vad är personens beskattningsbara inkomst");
			
			//Anropar nextInt() för att läsa in nästa heltal som skrivs in.
			beskattningsbarInkomst = scanner.nextInt();
			
			/*
			 * Här skapar jag en villkors konstruktion (selektion) där jag jämför av användaren
			 * det angivna beskattningsbara inkomsten och ser hur mycket den statliga skatten blir.
			 * */
			if(beskattningsbarInkomst <= 8900)
				statligSkatt = 0;
			else if(beskattningsbarInkomst > 9800 && beskattningsbarInkomst < 198700)
				statligSkatt = 100;
			else
			{
				statligSkatt = 100 + 0.2 * beskattningsbarInkomst;
			}
			
			//Skriver ut resultatet och frågar om användaren vill beräkna ny skatt.
			System.out.println("Personens statlig skatt som är baserat på " + beskattningsbarInkomst + " är " + statligSkatt);
			System.out.println("Vill du beräkna ny skatt? 1 = Ja, 0 = Nej");
			
			//Läser in det heltal användaren anger.
			int val = scanner.nextInt();
			
			//Selektion som jämför det angivna talet. Fortsätter om det är lika med 1 annars
			//Avslutas programmet med ett meddelande.
			if(val == 1)
				continue;
			else
				break;
		}
		scanner.close();
		System.out.println("Tack för att du använde mitt program. Hej då.");
	}
}
