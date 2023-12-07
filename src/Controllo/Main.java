package Controllo;

import Modello.Autoveicolo;
import Modello.Citta;
import Modello.GestioneReteAS;
import Modello.Percorrenza;
import Modello.Tratta;

public class Main {
    public static void main(String[] args) {
    	GestioneReteAS gestioneReteAS = new GestioneReteAS();
    	
	    // Creazione degli autoveicoli
	    Autoveicolo a0 = new Autoveicolo("XXX", "ALF", 2400);
	    Autoveicolo a1 = new Autoveicolo("YYY", "MER", 1600);
	    Autoveicolo a2 = new Autoveicolo("ZZZ", "VOL", 1900);
	    Autoveicolo a3 = new Autoveicolo("WWW", "REN", 1600);
	    
	    gestioneReteAS.aggiungiAutoveicolo(a0);
        gestioneReteAS.aggiungiAutoveicolo(a1);
        gestioneReteAS.aggiungiAutoveicolo(a2);
        gestioneReteAS.aggiungiAutoveicolo(a3);
	    
	    // Creazione delle città
	    Citta c0 = new Citta("Lamezia Terme", "CZ", "Calabria");
	    Citta c1 = new Citta("Rende", "CS", "Calabria");
	    Citta c2 = new Citta("Milano", "MI", "Lombardia");
	    Citta c3 = new Citta("Roma", "RM", "Lazio");
	    Citta c4 = new Citta("Firenze", "FI", "Toscana");
	    Citta c5 = new Citta("Torino", "TO", "Piemonte");
	    
	    gestioneReteAS.aggiungiCitta(c0);
        gestioneReteAS.aggiungiCitta(c1);
        gestioneReteAS.aggiungiCitta(c2);
        gestioneReteAS.aggiungiCitta(c3);
        gestioneReteAS.aggiungiCitta(c4);
        gestioneReteAS.aggiungiCitta(c5);
        
        
	    // Creazione delle tratte
	    Tratta t0 = new Tratta("cod00", "tratta0", c0, c1, 80.5);
	    Tratta t1 = new Tratta("cod01", "tratta1", c3, c1, 516.5);
	    Tratta t2 = new Tratta("cod02", "tratta2", c3, c4, 277.0);
	    Tratta t3 = new Tratta("cod03", "tratta3", c4, c2, 302.0);
	    Tratta t4 = new Tratta("cod04", "tratta4", c5, c2, 141.0);
	    
	    gestioneReteAS.aggiungiTratta(t0);
        gestioneReteAS.aggiungiTratta(t1);
        gestioneReteAS.aggiungiTratta(t2);
        gestioneReteAS.aggiungiTratta(t3);
        gestioneReteAS.aggiungiTratta(t4);
        
        
	    // Creazione delle percorrenze
	    Percorrenza p0 = new Percorrenza(t0, a0, 1);
	    Percorrenza p1 = new Percorrenza(t0, a1, 1);
	    Percorrenza p2 = new Percorrenza(t1, a1, 2);
	    Percorrenza p3 = new Percorrenza(t2, a2, 2);
	    Percorrenza p4 = new Percorrenza(t3, a3, 2);
	    Percorrenza p5 = new Percorrenza(t4, a0, 2);
	    Percorrenza p6 = new Percorrenza(t2, a2, 3);
	    Percorrenza p7 = new Percorrenza(t3, a3, 3);
	    Percorrenza p8 = new Percorrenza(t4, a3, 4);
	    
	    gestioneReteAS.aggiungiPercorrenza(p0);
        gestioneReteAS.aggiungiPercorrenza(p1);
        gestioneReteAS.aggiungiPercorrenza(p2);
        gestioneReteAS.aggiungiPercorrenza(p3);
        gestioneReteAS.aggiungiPercorrenza(p4);
        gestioneReteAS.aggiungiPercorrenza(p5);
        gestioneReteAS.aggiungiPercorrenza(p6);
        gestioneReteAS.aggiungiPercorrenza(p7);
        gestioneReteAS.aggiungiPercorrenza(p8);
        
        
        
        
        
        System.out.println(gestioneReteAS.accessi(c1));
        System.out.println(gestioneReteAS.trovaAutoveicoli(300));
        System.out.println(gestioneReteAS.trovaAutoFrequente(2, 4));
        System.out.println(gestioneReteAS.cittaGettonate());


    }
}
