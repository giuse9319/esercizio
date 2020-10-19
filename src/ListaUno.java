import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaUno implements Stampatore {

	List<Libro> listaLibriUno = new ArrayList<>();

	public void aggiungiLibro(Libro libri) {
		listaLibriUno.add(libri);
	}

	@Override
	public void stampa() {

		Collections.reverse(listaLibriUno);
		Iterator<Libro> iteratore = listaLibriUno.iterator();
		while (iteratore.hasNext()) {
			Libro libri = iteratore.next();
			System.out.println(libri.getTitolo() + " " + libri.getAnnoDiPubblicazione());

		}

	}

}
