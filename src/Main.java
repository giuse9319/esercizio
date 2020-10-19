import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Libro> lista = new ArrayList<>();

		lista.add(new Libro("Il piccolo principe", 1990));
		lista.add(new Libro("I pilastri della terra", 2000));
		lista.add(new Libro("Il grande impero", 2010));

		Stampatore s;

		s = new StampaOrdinato();
		s.stampa(lista);
		System.out.println("--------");
		s = new StampaAlContrario();
		s.stampa(lista);

		System.out.println("--------");

	}

}
