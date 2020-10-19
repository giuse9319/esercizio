import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaDue implements Stampatore {

	List<Libro> listaLibriDue = new ArrayList<>();

	public void aggiungiLibro(Libro libri) {
		listaLibriDue.add(libri);

	}

	@Override
	public void stampa() {

		Iterator<Libro> iteratore = listaLibriDue.iterator();
		while (iteratore.hasNext()) {
			Libro libri = iteratore.next();
			System.out.println(libri.getTitolo() + " " + libri.getAnnoDiPubblicazione());

		}

	}
}
