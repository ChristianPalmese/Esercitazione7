package Modello;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Tratta {
    private String codice;
    private String nome;
    private Citta cittaPartenza;
    private Citta cittaDestinazione;
    private double distanzaKm;
    private Citta citta;

    public Tratta(String codice, String nome, Citta cittaPartenza, Citta cittaDestinazione, double distanzaKm) {
        this.codice = codice;
        this.nome = nome;
        this.cittaPartenza = cittaPartenza;
        this.cittaDestinazione = cittaDestinazione;
        this.distanzaKm = distanzaKm;
    }
    
    

    public String getCodice() {
		return codice;
	}



	public void setCodice(String codice) {
		this.codice = codice;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Citta getCittaPartenza() {
		return cittaPartenza;
	}



	public void setCittaPartenza(Citta cittaPartenza) {
		this.cittaPartenza = cittaPartenza;
	}



	public Citta getCittaDestinazione() {
		return cittaDestinazione;
	}



	public void setCittaDestinazione(Citta cittaDestinazione) {
		this.cittaDestinazione = cittaDestinazione;
	}



	public double getDistanzaKm() {
		return distanzaKm;
	}



	public void setDistanzaKm(double distanzaKm) {
		this.distanzaKm = distanzaKm;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tratta tratta = (Tratta) o;
        return Objects.equals(codice, tratta.codice) &&
                Objects.equals(cittaPartenza, tratta.cittaPartenza) &&
                Objects.equals(cittaDestinazione, tratta.cittaDestinazione);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codice, cittaPartenza, cittaDestinazione);
    }


	@Override
	public String toString() {
		return "Tratta [codice=" + codice + ", nome=" + nome + ", cittaPartenza=" + cittaPartenza
				+ ", cittaDestinazione=" + cittaDestinazione + ", distanzaKm=" + distanzaKm + "]";
	}



	
}