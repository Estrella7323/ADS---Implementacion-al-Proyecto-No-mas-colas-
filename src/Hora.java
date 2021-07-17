import java.util.Scanner;

public class Hora {

    private int minutos;
    private int horas;
    public Hora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora de atención:");
        try {
            System.out.println("Ingrese la hora: ");
            this.horas = Integer.parseInt(sc.next());
            if (this.horas <= 23 && this.horas >=0 ){
                System.out.println("Hora Registrada");
            }else {
                throw new Exception("Error");
            }
        }catch (Exception e){
            System.err.println("Ingresa un número válido entre 0 y 23");
            this.horas = Integer.parseInt(sc.next());
        }

        try {
            System.out.println("Ingrese los minutos");
            this.minutos = Integer.parseInt(sc.next());
            if (this.minutos <= 59 && this.minutos >=0 ){
                System.out.println("minutos Registrada");
            }else {
                throw new Exception("Error");
            }
        }catch (Exception e){
            System.err.println("Ingresa un número válido entre 0 y 59");
            this.minutos = Integer.parseInt(sc.next());
        }
    }

    public Hora(int horas, int minutos ) {
        this.setHoras(horas);
        this.setMinutos(minutos);

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String toString() {
        return  this.horas + ":" + this.minutos;
    }
}
