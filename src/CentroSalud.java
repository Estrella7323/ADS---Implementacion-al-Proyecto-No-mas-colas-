import java.text.SimpleDateFormat;

public class CentroSalud implements Comparable<CentroSalud>{
	
	private int cod;
	private String Nombre;
	private String tipo;
	private Domicilio direccion;
	
	public CentroSalud(int cod, String nombre, String tipo, Domicilio direccion) {
		super();
		this.cod = cod;
		Nombre = nombre;
		this.tipo = tipo;
		this.direccion = direccion;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Domicilio direccion() {
		return direccion;
	}

	public void setDireccion(Domicilio direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
        return "CentroSalud \n"+
                "Codigo: "+ cod + "\n"+
                "Nombre del Centro de salud: " + this.Nombre +"\n"+
                "Tipo: " + this.tipo+"\n"+
                "Dirección: " + this.direccion + "\n";
    }

	@Override
	public int compareTo(CentroSalud arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
