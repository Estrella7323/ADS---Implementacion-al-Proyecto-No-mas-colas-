import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {

    public static void main(String[] args) throws ParseException, ExceptionIsEmpty {
        // TODO Auto-generated method stub
        Queue<String> q = new LinkedQueue<String>();
        /*Queue<String> g = new ArrayQueue<String>(2);
        Queue<String> a = new ArrayQueue<String>(2);
        Queue<String> b = new ArrayQueue<String>(2);*/
        try {
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        q.enqueue("5");
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
        Calendar fechaAtencion = Calendar.getInstance();
        fechaAtencion.setTime(sdf.parse("12-11-2000")); 
		Paciente p1 = new Paciente(1111000, "Estrella","Ortega",20, 73238465, null, null, fechaAtencion);
		Queue <Paciente> q1 = new LinkedQueue<Paciente>();
        System.out.println("*************************************************************************");
        try {
        q1.enqueue(p1);
        /*
        q1.enqueue(p2);
        q1.enqueue(p3);
        q1.enqueue(p4);
        q1.enqueue(p5);
        */
		System.out.println(q1);
        System.out.println("*************************************************************************");
        
    }
    catch(ExceptionIsEmpty x) {
        System.out.println(x.getMessage());
    }
    }
        
}
