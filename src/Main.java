public class Main {

	public static void main(String[] args) {

		ListaUno lista = new ListaUno();

		lista.aggiungiLibro(new Libro("Il piccolo principe", 1990));
		lista.aggiungiLibro(new Libro("I pilastri della terra", 2000));
		lista.aggiungiLibro(new Libro("Il grande impero", 2010));

		lista.stampa();

	}

}
