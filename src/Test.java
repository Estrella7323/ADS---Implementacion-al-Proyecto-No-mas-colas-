import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Test {
    private static ArrayList<RegisterHash<String>> regs = new ArrayList<RegisterHash<String>>();


    public static void main(String[] args) throws ParseException, ExceptionIsEmpty {
    	
        Queue<Integer> q = new LinkedQueue<Integer>();

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
		Paciente u1 = new Paciente(1111000, "Fabiola","Ortega",20, 30303030,direccion, hora, fechaAtencion);
		
		Hora hora1 = new Hora();
		Domicilio direccion1 = new Domicilio(null, null, null);
        Calendar fechaAtencion2 = Calendar.getInstance();
        fechaAtencion2.setTime(sdf.parse("12-10-2019")); 
		Paciente u2 = new Paciente(2111000, "Gian","Quispe",21, 73238460, direccion1, hora1, fechaAtencion2);
		
		Hora hora3 = new Hora();
		Domicilio direccion3 = new Domicilio(null, null, null);
        Calendar fechaAtencion3 = Calendar.getInstance();
        fechaAtencion3.setTime(sdf.parse("12-10-2019")); 
		Paciente u3 = new Paciente(842540, "Alex","C",20, 30303030, direccion3, hora3, fechaAtencion3);///Duplicado


        Hora hora4 = new Hora();
        Domicilio direccion4 = new Domicilio(null, null, null);
        Calendar fechaAtencion4 = Calendar.getInstance();
        fechaAtencion3.setTime(sdf.parse("12-10-2019"));
        Paciente u4 = new Paciente(1596200, "Luis","C",19, 73296845, direccion4, hora4, fechaAtencion4);

        Hora hora5 = new Hora();
        Domicilio direccion5 = new Domicilio(null, null, null);
        Calendar fechaAtencion5 = Calendar.getInstance();
        fechaAtencion3.setTime(sdf.parse("12-10-2019"));
        Paciente u5 = new Paciente(31632970, "Fernanda","C",20, 81156345, direccion5, hora5, fechaAtencion5);

        Hora hora6 = new Hora();
        Domicilio direccion6 = new Domicilio(null, null, null);
        Calendar fechaAtencion6 = Calendar.getInstance();
        fechaAtencion3.setTime(sdf.parse("12-10-2019"));
        Paciente u6 = new Paciente(2495000, "Alejandro","C",36, 73248965, direccion6, hora6, fechaAtencion6);

        Hora hora7 = new Hora();
        Domicilio direccion7 = new Domicilio(null, null, null);
        Calendar fechaAtencion7 = Calendar.getInstance();
        fechaAtencion3.setTime(sdf.parse("12-10-2019"));
        Paciente u7 = new Paciente(3325000, "Daniela","C",19, 73356984, direccion3, hora7, fechaAtencion7);



        Hash<String> h = new Hash<String>(7); //h(x) Será nuestro mod

        h.insert(u1.getDni(), u1.getNombre());
        h.insert(u2.getDni(), u2.getNombre());
        h.insert(u3.getDni(), u3.getNombre());
        h.insert(u4.getDni(), u4.getNombre());
        h.insert(u5.getDni(), u5.getNombre());
        h.insert(u6.getDni(), u6.getNombre());
        h.insert(u7.getDni(), u7.getNombre());
        System.out.println("h.search(30303030) = " + h.search(30303030));


        System.out.println("--------------------------");

        System.out.println(h);

        System.out.println("--------------------------");










        Queue <Paciente> q1 = new LinkedQueue<Paciente>();
        System.out.println("**********************************************************************************************************************************");
        q1.enqueue(u1);
        
        q1.enqueue(u2);
        
        q1.enqueue(u3);
        
		System.out.println(q1);
        System.out.println("**********************************************************************************************************************************");
          
        q1.back();
        
        System.out.println("**********************************************************************************************************************************");
		
        System.out.println(q1);
		
        System.out.println("**********************************************************************************************************************************");
    
        q1.front();


        System.out.println("**********************************************************************************************************************************");


        System.out.println("\n");
        System.out.println("Centros de salud");
        Domicilio direccion04 = new Domicilio("Castillo","80","Alto Selva Alegre");
        CentroSalud p4 = new CentroSalud(3178020,"Farmacos Axelander","Farmacia", direccion04);
        System.out.println(p4);

        Domicilio direccion05 = new Domicilio("Melgar","80","Mariano Melgar");
        CentroSalud p5 = new CentroSalud(3178030,"Hospital Viscarra","Hospital", direccion05);
        System.out.println(p5);

        Domicilio direccion06 = new Domicilio("LuisManuel","80","Hunter");
        CentroSalud p6 = new CentroSalud(3178040,"Clinica Holguino","Clinica", direccion06);
        System.out.println(p6);

        Domicilio direccion07 = new Domicilio("Luren","101","Alto Selva Alegre");
        CentroSalud p7 = new CentroSalud(3178050,"Quispe Asociados","Farmacia", direccion07);
        System.out.println(p7);

        Domicilio direccion08 = new Domicilio("Calle Lima","202","Miraflores");
        CentroSalud p8 = new CentroSalud(3178060,"Alcafarma","Farmacia", direccion08);
        System.out.println(p8);

        GraphLink<String> g= new GraphLink<String>();

        g.insertVertex(p4.getNombre());
        g.insertVertex(p5.getNombre());
        g.insertVertex(p6.getNombre());
        g.insertVertex(p7.getNombre());
        g.insertVertex(p8.getNombre());

        g.insertEdgeWeight(p4.getNombre(), p5.getNombre(),10);
        g.insertEdgeWeight(p6.getNombre(), p7.getNombre(),15);
        g.insertEdgeWeight(p5.getNombre(), p7.getNombre(),6);
        g.insertEdgeWeight(p8.getNombre(), p6.getNombre(),10);
        g.insertEdgeWeight(p7.getNombre(), p4.getNombre(),5);
        g.insertEdgeWeight(p8.getNombre(), p4.getNombre(),6);
        g.insertEdgeWeight(p5.getNombre(), p6.getNombre(),8);
        g.insertEdgeWeight(p7.getNombre(), p8.getNombre(),4);

        System.out.println("Grafo farmacias:\n"+g);
    }
}

