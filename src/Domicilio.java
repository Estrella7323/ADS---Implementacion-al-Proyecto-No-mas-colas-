

import java.util.Scanner;

public class Domicilio {
	private String calle;
	private String numero;
	private String distrito;
	public Domicilio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese calle , numero y distrito:");
		this.calle = sc.next();
		this.numero = sc.next();
		this.distrito = sc.next();
	}
	
	public Domicilio(String calle, String numero , String distrito) {
		this.setCalle(calle);
		this.setDistrito(distrito);
		this.setNumero(numero);
		
		
		/*
		Scanner sc = new Scanner(System.in);
		String calle , numero , dist;
		System.out.println("Ingrese calle , numero y distrito");
		this.calle = sc.next();
		this.numero = sc.next();
		this.distrito = sc.next();
	
		*/
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
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String toString() {
		return this.calle + " " + this.numero + " - " + this.distrito;
	}
	
}
