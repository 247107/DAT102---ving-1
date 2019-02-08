package no.hvl.dat102;

import no.hvl.dat102.adt.CDarkivADT;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fil {

	public static void lesFraFil(CDarkivADT cdarkiv, String filnavn) {
		final String SKILLE = "#";

		FileReader fil = null;
		try {
			fil = new FileReader(filnavn);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(fil);
		sc.useDelimiter(SKILLE);
		int CDnummer = Integer.parseInt(sc.nextLine());
		String Artist = sc.next();
		String Tittel = sc.next();
		int År = Integer.parseInt(sc.nextLine());
		String Plateselskap = sc.next();
	}

	public static void skrivTilFil(CDarkivADT cdarkiv, String filnavn) {
		final String SKILLE = "#";
		CD[] cdTabell = cdarkiv.hentCdTabell();

		try {
			FileWriter CDFil = new FileWriter(filnavn);
			PrintWriter utfil = new PrintWriter(CDFil);

			int antall = 0;
			utfil.println(antall);
			for (int i = 0; i < antall; i++) {
				utfil.print(cdarkiv.hentCdTabell()[i].getCDnummer());
				utfil.print(SKILLE);
				utfil.print(cdarkiv.hentCdTabell()[i].getArtist());
				utfil.print(SKILLE);
				utfil.print(cdarkiv.hentCdTabell()[i].getTittel());
				utfil.print(SKILLE);
				utfil.print(cdarkiv.hentCdTabell()[i].getÅr());
				utfil.print(SKILLE);
				utfil.print(cdarkiv.hentCdTabell()[i].getSjanger());
				utfil.print(SKILLE);
				utfil.print(cdarkiv.hentCdTabell()[i].getPlateselskap());
				utfil.println();
			}
			utfil.close();

		} catch (IOException e) {
		}

	}
}
