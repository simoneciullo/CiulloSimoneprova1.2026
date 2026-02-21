//modifica online
import java.util.Arrays;

public class Libreria {
	private String nome;
	//private int maxLibri;
	private Libro[] libri;
	//private Libro libri[];
	private int numLibri;
	
	public Libreria(String nome, int maxLibri) {
		libri=new Libro[maxLibri];
		numLibri=0;
		this.nome=nome;
	}
	/*public boolean addLibro(Libro lib) {
		libri[numLibri]=lib;
		numLibri++;
		return false;
	}*/
	public boolean addLibro(Libro lib) {
		if(numLibri<libri.length) {
			libri[numLibri]=lib;
			numLibri++;
			return true;
		}
		return false;
	}
	/*@Override
	public String toString() {
		return "Libreria [nome=" + nome + ", libri=" + Arrays.toString(libri) + "]";
	*/
	//elimina libro per posizione senza controllo
	
	public void delLibroPos (int pos) {
		libri[pos]=null;
	}
	
	//elimina libro per codice con controllo
	
	public boolean delLibroCodice (String cod) {
		for(int i=0; i<libri.length; i++) {
			if(libri[i]!=null && libri[i].getCodice().equalsIgnoreCase(cod)) {
				libri[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String s="Nome Libreria: "+nome+"\n";
		for(int i=0; i<libri.length; i++) {
			if(libri[i]!=null)
				s+=libri[i]+"\n";
		}
		
		return s;
	}
	public static void main(String[] args) {
		Libreria libCentrale=new Libreria("libreria viale ferrari", 3);
		Libro lib1=new Libro("libro 1", "autore 1");
		Libro lib2=new Libro("libro 2", "autore 2");
		System.out.println(libCentrale.addLibro(lib1));
		System.out.println(libCentrale.addLibro(lib2));
		System.out.println(libCentrale); 
	}
}

