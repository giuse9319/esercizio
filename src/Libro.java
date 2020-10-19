
public class Libro {

	private String titolo;
	private int annoDiPubblicazione;

	public Libro(String titolo, int annoDiPubblicazione) {

		this.titolo = titolo;
		this.annoDiPubblicazione = annoDiPubblicazione;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}

	public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
		this.annoDiPubblicazione = annoDiPubblicazione;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", annoDiPubblicazione=" + annoDiPubblicazione + "]";
	}

}
