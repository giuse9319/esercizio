import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StampaAlContrario implements Stampatore {

	@Override
	public void stampa(List<Libro> l) {

		Collections.reverse(l);
		Iterator<Libro> iteratore = l.iterator();
		while (iteratore.hasNext()) {
			Libro libri = iteratore.next();
			System.out.println(libri.getTitolo() + " " + libri.getAnnoDiPubblicazione());

		}

	}

}
