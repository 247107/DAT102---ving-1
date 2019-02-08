package no.hvl.dat102;

public class CD {

		
		private int CDnummer; 
		private String Artist;
		private String Tittel;
		private int År;
		private Sjanger sjanger;
		private String Plateselskap;
	
	public CD() {

	}
	
	public CD(int CDnummer, String Artist, String Tittel, int År, Sjanger sjanger, String Plateselskap) {
	this.CDnummer = CDnummer;
	this.Artist = Artist;
	this.Tittel = Tittel;
	this.År = År;
	this.sjanger = sjanger; 
	this.Plateselskap = Plateselskap;
	}

	public int getCDnummer() {
		return CDnummer;
	}

	public void setCDnummer(int cDnummer) {
		CDnummer = cDnummer;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	public String getTittel() {
		return Tittel;
	}

	public void setTittel(String tittel) {
		Tittel = tittel;
	}

	public int getÅr() {
		return År;
	}

	public void setÅr(int år) {
		År = år;
	}

	public String getPlateselskap() {
		return Plateselskap;
	}

	public void setPlateselskap(String plateselskap) {
		Plateselskap = plateselskap;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	
	
	

}
