package Modello;

import java.util.HashMap;
import java.util.List;

public class Citta {
    private String nome;
    private String provincia;
    private String regione;
   
    public Citta(String nome, String provincia, String regione) {
		super();
		this.nome = nome;
		this.provincia = provincia;
		this.regione = regione;
		
	}

	public String getNome() {
        return nome;
    }

	public String getProvincia() {
        return provincia;
    }

    public String getRegione() {
        return regione;
    }
    
    

    public void setNome(String nome) {
		this.nome = nome;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public void setRegione(String regione) {
		this.regione = regione;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Citta other = (Citta) obj;
        return nome.equals(other.nome) && provincia.equals(other.provincia);
    }


	@Override
    public String toString() {
        return nome + ", " + provincia + ", " + regione;
    }
}
