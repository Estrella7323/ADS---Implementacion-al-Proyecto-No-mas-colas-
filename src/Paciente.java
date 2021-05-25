
public class Paciente implements Comparable<Paciente>{
	
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	private Domicilio direccion;
	public Person(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int edadMax(){
		return 0;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	@Override
	public int compareTo(Paciente pa1){
		if (this.edad >pa1.getEdad())//
			return 1;
		if (this.edad <pa1.getEdad())
			return -1;
		return 0;
	}

}