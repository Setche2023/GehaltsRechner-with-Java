package Einstieg;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GehaltsRechner {

	public static void main(String[] args) {
		// Alle Variable initalisieren
		double bruttoGehalt = 00.0;
		double nettoGehalt;
		double abzuege;
		int steuerSatz;
		double steuerSatzProzent;
		
		//Variante 1: relativ unbrauchbar, da wird immer Quellcode anpassen müssten
		bruttoGehalt = 3245.47;
		steuerSatz = 20;
		
		//Variante 2: Benutzereingaben
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Brutogehalt eingeben: ");
		
		if(eingabe.hasNextDouble()) {
		bruttoGehalt = eingabe.nextDouble();
		}
		else {
			System.out.println("Falsche Eingabe)");
			System.exit(0);
		}
		
		System.out.println("Steuersatz eingeben: ");
		steuerSatz = (int)eingabe.nextDouble();	
		
		
		//steuerSatzProzent = steuerSatz / 100.0;
		steuerSatzProzent = steuerSatz / 100.0;
		abzuege = bruttoGehalt * steuerSatzProzent;
		nettoGehalt = bruttoGehalt - abzuege;
		
		DecimalFormat meinFormat = new DecimalFormat(",###.00");
		meinFormat.setPositiveSuffix(" €");
		
		System.out.println("Brutto:  " + meinFormat.format(bruttoGehalt));
		System.out.println("Abzüge: " + meinFormat.format(abzuege));
		System.out.println("Netto: " + meinFormat.format(nettoGehalt));
		
	
	}

}
