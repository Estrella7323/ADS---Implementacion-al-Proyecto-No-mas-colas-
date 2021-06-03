

import java.util.Scanner;

public class Domicilio {
	private String calle;
	private String numero;
	private String distrito;
	
	public Domicilio(String calle, String numero, String distrito) {
		this.calle = calle;
		this.numero = numero;
		this.distrito = distrito;
    }

    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String toString() {
        return (this.calle + " "+ this.numero +" "+ this.distrito);
    }



}
