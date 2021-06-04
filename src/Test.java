import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {

    public static void main(String[] args) throws ParseException, ExceptionIsEmpty {
    	
        Queue<Integer> q = new LinkedQueue<Integer>();
        /*Queue<String> g = new ArrayQueue<String>(2);
        Queue<String> a = new ArrayQueue<String>(2);
        Queue<String> b = new ArrayQueue<String>(2);*/
        try {
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
		System.out.println(q);
        System.out.println(q.isEmpty());
        //a.enqueue("hola");

        q.back();
        System.out.println("\n");
        q.front();

        System.out.println(q.isEmpty());
        System.out.println("otro");


    }
    catch(ExceptionIsEmpty x) {
        System.out.println(x.getMessage());

    }   	
        System.out.println("Demostracion de la clase LinkedQueue con la clase persona");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Hora hora = new Hora();
		Domicilio direccion = new Domicilio("Torres","45","Alto Selva Alegre");
        Calendar fechaAtencion = Calendar.getInstance();
        fechaAtencion.setTime(sdf.parse("12-10-2019")); 
		Paciente p1 = new Paciente(1111000, "Estrella","Ortega",20, 73238465,direccion, hora, fechaAtencion);	
		
		Hora hora1 = new Hora();
		Domicilio direccion1 = new Domicilio(null, null, null);
        Calendar fechaAtencion2 = Calendar.getInstance();
        fechaAtencion2.setTime(sdf.parse("12-10-2019")); 
		Paciente p2 = new Paciente(2111000, "Gian","Quispe",21, 73238460, direccion1, hora1, fechaAtencion2);
		
		Hora hora3 = new Hora();
		Domicilio direccion3 = new Domicilio(null, null, null);
        Calendar fechaAtencion3 = Calendar.getInstance();
        fechaAtencion3.setTime(sdf.parse("12-10-2019")); 
		Paciente p3 = new Paciente(3111000, "Alex","C",20, 73238465, direccion3, hora3, fechaAtencion3);
		
		Queue <Paciente> q1 = new LinkedQueue<Paciente>();
        System.out.println("**********************************************************************************************************************************");
        q1.enqueue(p1);
        
        q1.enqueue(p2);
        
        q1.enqueue(p3);
        
		System.out.println(q1);
        System.out.println("**********************************************************************************************************************************");
          
        q1.back();
        
        System.out.println("**********************************************************************************************************************************");
		
        System.out.println(q1);
		
        System.out.println("**********************************************************************************************************************************");
    
        q1.front();
    }
}

