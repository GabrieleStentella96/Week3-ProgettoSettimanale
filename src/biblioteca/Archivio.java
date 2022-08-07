package biblioteca;

import bibliotecadao.ElementoDao;

public class Archivio {

	public static void main(String[] args) {
		//lista di libri 
		libroElementoBiblioteca libro1 = new libroElementoBiblioteca("123abc", "Come frodare il fisco", 2008, 670, "biografia", "Teo Truffalfini");
		libroElementoBiblioteca libro2 = new libroElementoBiblioteca("456def", "Come organizzare un buon openday", 2018, 550, "saggio", "Elia Sandrelli");
		libroElementoBiblioteca libro3 = new libroElementoBiblioteca("789ghi", "I fiori del Male", 1857, 890, "poesia", "Charles Baudelaire");
		
		
		
		//lista delle riviste
		rivistaElementoBiblioteca rivista1 = new rivistaElementoBiblioteca("123abc", "I migliori panini imbottiti del mese", 2022, 75, Periodicita.mensile);
		rivistaElementoBiblioteca rivista2 = new rivistaElementoBiblioteca("456scc", "La sciopeta: il settimanale dei cacciatori veneti", 2022, 75, Periodicita.settimanale);
	    ElementoDao elementodao = new ElementoDao();
		
		elementodao.inserisci(libro1);
		elementodao.inserisci(libro2);
		elementodao.inserisci(libro3);
		elementodao.inserisci(rivista1);
		elementodao.inserisci(rivista2);
	
	}
	
	

}
