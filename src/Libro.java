//versione 6 online


public class Libro {
	private String titolo;
	private String autore;
	private String codice;
	private int pagine;
	
	public Libro(String titolo, String autore) {
		this.titolo=titolo;
		this.autore=autore;
	}
	public void setCodice(String codice) {
		this.codice=codice;
	}
	
	public String getCodice() {
		return codice;
	}
	public void setPagine(int pagine) {
		this.pagine=pagine;
	}
	public String toString() {
		return "Libro \ntitolo:"+titolo+"\nautore: "+autore+"\ncodice: "+codice+"\npagine: "+pagine;
	}
	public static void main(String[] args) {
		Libro l1=new Libro("il piccolo principe", "simone ciullo");
		l1.setCodice("cod1234");
		l1.setPagine(1438);
		System.out.println(l1);
	}
}
