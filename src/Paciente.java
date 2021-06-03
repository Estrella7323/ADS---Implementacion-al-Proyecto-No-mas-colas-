
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Paciente  extends Person implements Comparable<Paciente> {
	
	private int id;
	private Domicilio direccion;
	private Hora Horallegada;
	private Calendar fechaAtencion;
	
	public Paciente(int id, String nombre,String apellido,int edad ,int dni , Domicilio direccion ,Hora Horallegada,Calendar fechaAtencion) {
		super(nombre , apellido ,edad ,dni);
		this.direccion = new Domicilio();
		this.Horallegada = new Hora ();
		this.fechaAtencion = fechaAtencion;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public Domicilio getDireccion() {
		return direccion;
	}
	public void setDireccion(Domicilio direccion) {
		this.direccion = direccion;
	}
	public Calendar getFechaAtencion() {
		return fechaAtencion;
	}
	public void setFechaAtencion(Calendar fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public Hora getHorallegada() {
		return Horallegada;
	}

	public void setHorallegada(Hora horallegada) {
		Horallegada = horallegada;
	}



	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "Paciente : [id=" + id + super.toString() + 
				", Direccion=" + this.direccion + "Hora de llegada\t; " + this.Horallegada+"\n"+
				"fechaAtencion=" + sdf.format(this.fechaAtencion.getTime()) + "]";
	}

	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		return 0;
	}

}