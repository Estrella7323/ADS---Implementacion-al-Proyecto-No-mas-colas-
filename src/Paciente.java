import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Paciente  extends Person implements Comparable<Paciente> {

    private int id;
    private Domicilio direccion;
    private Hora horallegada;
    private Calendar fechaAtencion;



    public Paciente(int id, String nombre,String apellido,int edad ,int dni , Domicilio direccion ,Hora horallegada,Calendar fechaAtencion) {
        super(nombre , apellido ,edad ,dni);
        this.id = id;
        this.direccion = direccion;
        this.horallegada = horallegada;
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
        return horallegada;
    }

    public void setHorallegada(Hora horallegada) {
        this.horallegada = horallegada;
    }



    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return "Paciente:\n"+
                "id:"+ id + "\n"+
                super.toString() +"\n"+
                "Direccion:" + this.direccion +"\n"+
                "Hora de Atencion: " + this.horallegada+"\n"+
                "Fecha de Atencion=" + sdf.format(this.fechaAtencion.getTime()) + "\n";
    }

    @Override
    public int compareTo(Paciente o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
