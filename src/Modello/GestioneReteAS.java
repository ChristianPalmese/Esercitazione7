package Modello;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestioneReteAS {
    private List<Citta> listaCitta;
    private List<Tratta> listaTratte;
    private List<Autoveicolo> listaAutoveicoli;
    private List<Percorrenza> listaPercorrenze;

    public GestioneReteAS() {
        this.listaCitta = new ArrayList<>();
        this.listaTratte = new ArrayList<>();
        this.listaAutoveicoli = new ArrayList<>();
        this.listaPercorrenze = new ArrayList<>();
    }

    public void aggiungiCitta(Citta citta) {
        listaCitta.add(citta);
    }

    public void aggiungiTratta(Tratta tratta) {
        listaTratte.add(tratta);
    }

    public void aggiungiAutoveicolo(Autoveicolo autoveicolo) {
        listaAutoveicoli.add(autoveicolo);
    }

    public void aggiungiPercorrenza(Percorrenza percorrenza) {
        listaPercorrenze.add(percorrenza);
    }
    
    public int accessi(Citta c) {
        int conteggioAccessi = 0;

        for (Percorrenza percorrenza : listaPercorrenze) {
            Tratta tratta = percorrenza.getTrattaPercorsa();
            if (tratta.getCittaDestinazione().equals(c)) {
                conteggioAccessi++;
            }
        }

        return conteggioAccessi;
    }
    
    public ArrayList<Autoveicolo> trovaAutoveicoli(int x) {
        ArrayList<Autoveicolo> listaAutoveicolo = new ArrayList<>();

        for (Autoveicolo autoveicolo : listaAutoveicoli) {
            boolean haPercorsoDistanzaSuperiore = false;

            for (Percorrenza percorrenza : listaPercorrenze) {
                Tratta tratta = percorrenza.getTrattaPercorsa();
                if (percorrenza.getAutoveicolo().equals(autoveicolo) && tratta.getDistanzaKm() > x) {
                    haPercorsoDistanzaSuperiore = true;
                    break;
                }
            }

            if (!haPercorsoDistanzaSuperiore) {
                listaAutoveicolo.add(autoveicolo);
            }
        }
        return listaAutoveicolo;
    }

    public Autoveicolo trovaAutoFrequente(int d1, int d2) {
    	HashMap<Autoveicolo, Integer> conteggioAutoveicolo= new HashMap<>();
    	
    	for(Percorrenza percorrenza:listaPercorrenze) {
    		int data=percorrenza.getData();
    		if(data >= d1 && data <= d2) {
    			Autoveicolo autoveicolo =percorrenza.getAutoveicolo();
    			conteggioAutoveicolo.put(autoveicolo, +1);
    		}
    	}
    	
    	int valoreMassimo = Integer.MIN_VALUE;

        for (int valore : conteggioAutoveicolo.values()) {
            if (valore > valoreMassimo) {
                valoreMassimo = valore;
            }
        }
        for (Map.Entry<Autoveicolo, Integer> entry : conteggioAutoveicolo.entrySet()) {
            if (entry.getValue() == valoreMassimo) {
                return entry.getKey();
            }
        }
        return null; 
    }
        
    public ArrayList<Citta> cittaGettonate() {
        HashMap<Citta, Integer> conteggioAccessiCitta = new HashMap<>();

        // Calcola il numero di accessi per ciascuna città
        for (Percorrenza percorrenza : listaPercorrenze) {
            Citta cittaDestinazione = percorrenza.getTrattaPercorsa().getCittaDestinazione();

            conteggioAccessiCitta.put(cittaDestinazione, conteggioAccessiCitta.getOrDefault(cittaDestinazione, 0) + 1);
        }

        // Converti la mappa in una lista di voci per ordinare in base al numero di accessi
        List<Map.Entry<Citta, Integer>> listaCittaOrdinata = new ArrayList<>(conteggioAccessiCitta.entrySet());
        listaCittaOrdinata.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Crea una lista ordinata delle città in base al numero di accessi
        ArrayList<Citta> cittaOrdinate = new ArrayList<>();
        for (Map.Entry<Citta, Integer> entry : listaCittaOrdinata) {
            cittaOrdinate.add(entry.getKey());
        }

        return cittaOrdinate;
    }

    
    
    
    
    

	@Override
	public String toString() {
		return "GestioneReteAS [listaCitta=" + listaCitta + ", listaTratte=" + listaTratte + ", listaAutoveicoli="
				+ listaAutoveicoli + ", listaPercorrenze=" + listaPercorrenze + "]";
	}
    
    
}
	


