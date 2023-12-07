package Modello;

public class Percorrenza {
    private Tratta trattaPercorsa;
    private Autoveicolo autoveicolo;
    private int data;

    public Percorrenza(Tratta trattaPercorsa, Autoveicolo autoveicolo, int data) {
        this.trattaPercorsa = trattaPercorsa;
        this.autoveicolo = autoveicolo;
        this.data = data;
    }

   
    public Tratta getTrattaPercorsa() {
        return trattaPercorsa;
    }

    public Autoveicolo getAutoveicolo() {
        return autoveicolo;
    }

    public int getData() {
        return data;
    }


	public void setTrattaPercorsa(Tratta trattaPercorsa) {
		this.trattaPercorsa = trattaPercorsa;
	}


	public void setAutoveicolo(Autoveicolo autoveicolo) {
		this.autoveicolo = autoveicolo;
	}


	public void setData(int data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Percorrenza [trattaPercorsa=" + trattaPercorsa + ", autoveicolo=" + autoveicolo + ", data=" + data
				+ "]";
	}
    
    
}



