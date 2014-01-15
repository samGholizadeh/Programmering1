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
		
		//Initialisera tv� variabler som vi beh�ver. M�ste initialisera f�r att kunna anv�nda i while-loopen.
		double statligSkatt = 0;
		int beskattningsbarInkomst = 0;
		
		//While loop som itererar kod sekvensen innuti. Vi har angiviget keyword true som villkor vilket
		//inneb�r att programmet kommer att iterera o�ndligt tills man bryter det manuellt genom
		//att anv�nda keyword break.
		while(true)
		{
			//Informera anv�ndaren om vad programmet handlar om.
			System.out.println("Hej och v�lkommen till mitt sofistikerade skattber�knings program");
			System.out.println("Vad �r personens beskattningsbara inkomst");
			
			//Anropar nextInt() f�r att l�sa in n�sta heltal som skrivs in.
			beskattningsbarInkomst = scanner.nextInt();
			
			/*
			 * H�r skapar jag en villkors konstruktion (selektion) d�r jag j�mf�r av anv�ndaren
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
			
			//Skriver ut resultatet och fr�gar om anv�ndaren vill ber�kna ny skatt.
			System.out.println("Personens statlig skatt som �r baserat p� " + beskattningsbarInkomst + " �r " + statligSkatt);
			System.out.println("Vill du ber�kna ny skatt? 1 = Ja, 0 = Nej");
			
			//L�ser in det heltal anv�ndaren anger.
			int val = scanner.nextInt();
			
			//Selektion som j�mf�r det angivna talet. Forts�tter om det �r lika med 1 annars
			//Avslutas programmet med ett meddelande.
			if(val == 1)
				continue;
			else
				break;
		}
		scanner.close();
		System.out.println("Tack f�r att du anv�nde mitt program. Hej d�.");
	}
}
