package no.hvl.dat102;

import no.hvl.dat102.adt.CDarkivADT;
import java.util.Scanner;

public class Tekstgrensesnitt {
	private Scanner sc = new Scanner(System.in);

	// lese opplysningene om en CD fra tastatur
	public CD lesCD() {
		System.out.println("CDnummer: ");
		int CDnummer = sc.nextInt();
		sc.nextLine();
		System.out.println("Artist: ");
		String Artist = sc.nextLine();
		System.out.println("Tittel: ");
		String tittel = sc.nextLine();
		System.out.println("Lanseringsår: ");
		int År = sc.nextInt();
		sc.nextLine();
		System.out.println("Velg en sjanger:");
		System.out.println("1) ROCK");
		System.out.println("2) POP");
		System.out.println("3) OPERA");
		System.out.println("4) JAZZ");
		System.out.println("5) KLASSISK");

		int valg = sc.nextInt();
		sc.nextLine();
		Sjanger sjanger = Sjanger.KLASSISK;
		if (valg == 1) {
			sjanger = Sjanger.ROCK;
		} else if (valg == 2) {
			sjanger = Sjanger.POP;
		} else if (valg == 3) {
			sjanger = Sjanger.OPERA;
		} else if (valg == 4) {
			sjanger = Sjanger.JAZZ;
		} else if (valg == 5){
            sjanger = Sjanger.KLASSISK;
		}
		System.out.println("Plateselskap: ");
		String plateselskap = sc.nextLine();
		return new CD(CDnummer, Artist, tittel, År, sjanger, plateselskap);

	}

	// vise en CD med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visCD(CD cd) {
		System.out.println("CDnummer: " + cd.getCDnummer());
		System.out.println("Artist " + cd.getArtist());
		System.out.println("Tittel: " + cd.getTittel());
		System.out.println("År " + cd.getÅr());
		System.out.println("Sjanger: " + cd.getSjanger().toString());
		System.out.println("Plateselskap: " + cd.getPlateselskap());
		System.out.println();
	}

	// Skrive ut alle CD-er med en spesiell delstreng i tittelen
	public void skrivUtCdDelstrengITittel(CDarkiv cda, String delstreng) {
		CD[] cd = cda.finnCD(delstreng);
		for (CD c : cd) {
			visCD(c);
		}
	}

	// Skriver ut alle CD-er av en artist / en gruppe
	public void skrivUtCdArtist(CDarkiv cda, String delstreng) {
		CD[] cd = cda.sokArtist(delstreng);
		for (CD c : cd) {
			visCD(c);
		}
	}

	// Skrive ut en enkel statistikk som inneholder antall CD-er totalt // og hvor
	// mange det er i hver sjanger
	public void skrivUtStatistikk(CDarkivADT cda) {
		int antallCD = cda.antall();
		System.out.println("Det er " + antallCD + " CDer tilgjengelige");
		for (Sjanger s : Sjanger.values()) {
			int tall = cda.antallSjanger(s);
			System.out.println("Det er " + tall + " CDer som har sjangeren " + s.toString());
		}
	} // ... Ev. andre metoder

}// class
