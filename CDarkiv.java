package no.hvl.dat102;

import no.hvl.dat102.adt.CDarkivADT;


public class CDarkiv implements CDarkivADT {
	// Instansvariable
	private CD[] cdTabell;
	private int antall;
	// Konstruktører og andre metoder
	// ...fyll ut

	public CDarkiv(int plasser) {
    	cdTabell = new CD[plasser];
    	antall = 0;
    }

	public CD[] hentCdTabell() {
		return cdTabell;
	}

	public void leggTil(CD element) {
		if (antall == cdTabell.length) {
			utvidKapasitet();
		}
		cdTabell[antall] = element;
		antall++;
	}

	private void utvidKapasitet() {
		CD[] hjelpetabell = new CD[(int) Math.ceil(1.1 * cdTabell.length)];
		for (int i = 0; i < cdTabell.length; i++) {
			hjelpetabell[i] = cdTabell[i];
		}
		cdTabell = hjelpetabell;
	}

	public boolean slettCd(int cdNr) {

		int index = -1;

		for (int i = 0; i < antall; i++) {
			if (cdTabell[i].getCDnummer() == cdNr) {
				index = i;
			}
		}
		if (index >= 0) {
			cdTabell[index] = cdTabell[antall - 1];
			antall--;
			return true;
		} else {
			return false;
		}
	}

	private int finnCD(int CDnummer){
	       for (int i = 0; i < antall; i++){
	           if(cdTabell[i].getCDnummer() == CDnummer){
	               return i;
	           }
	       }
	       return -1;
	}
	
	private int finnAntall(int valg, String delstreng) {
		int teller = 0;
		if (valg == 1) {
			for (int i = 0; i < antall; i++) {
				if (cdTabell[i].getTittel().contains(delstreng)) {
					teller++;
				}
			}
			return teller;
		} else {
			for (int i = 0; i < antall; i++) {
				if (cdTabell[i].getArtist().contains(delstreng)) {
					teller++;
				}
			}
			return teller;
		}
	}

	public CD[] sokTittel(String delstreng) {
		int mengde = finnAntall(1, delstreng);

		CD[] tittelCD = new CD[mengde];
		int teller = 0;
		for (int i = 0; i < antall; i++) {
			if (cdTabell[i].getTittel().toLowerCase().contains(delstreng.toLowerCase())) {
				tittelCD[teller] = cdTabell[i];
				teller++;
			}
		}
		return tittelCD;
	}

	public CD[] sokArtist(String delstreng) {
		int mengde = finnAntall(2, delstreng);

		CD[] artistCD = new CD[mengde];
		int teller = 0;
		for (int i = 0; i < antall; i++) {
			if (cdTabell[i].getArtist().toLowerCase().contains(delstreng.toLowerCase())) {
				artistCD[teller] = cdTabell[i];
				teller++;
			}
		}
		return artistCD;
	}

	public int antallCD() {
        return antall;
    }
	
	public int antallSjanger(Sjanger sjanger) {
		int teller = 0;
		for (CD c : cdTabell) {
			if (c == null) {
			} else if (c.getSjanger() == sjanger) {
				teller++;
			}
		}
		return teller;
	}

	@Override
	public void leggTilCd(CD nyCd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}
}
