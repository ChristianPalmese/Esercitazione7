package Modello;

import java.util.Objects;

public class Autoveicolo {
    private String targa;
    private String marca;
    private int cilindrata;

    public Autoveicolo(String targa, String marca, int cilindrata) {
        this.targa = targa;
        this.marca = marca;
        this.cilindrata = cilindrata;
    }

   
    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrata() {
        return cilindrata;
    }


	public void setTarga(String targa) {
		this.targa = targa;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autoveicolo that = (Autoveicolo) o;
        return cilindrata == that.cilindrata &&
                Objects.equals(targa, that.targa) &&
                Objects.equals(marca, that.marca);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(targa, marca, cilindrata);
    }
    
    
	@Override
	public String toString() {
		return "Autoveicolo [targa=" + targa + ", marca=" + marca + ", cilindrata=" + cilindrata + "]";
	}
    
    
}




	
	
	
	
	
	
	
	
	

