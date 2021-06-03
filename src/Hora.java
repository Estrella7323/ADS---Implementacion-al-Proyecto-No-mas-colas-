import java.util.Scanner;

public class Hora {

    private String minutos;
    private String horas;
    public Hora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hora ( hora minutos(");
        this.minutos = sc.next();
        this.horas = sc.next();
    }

    public Hora(String horas, String minutos ) {
        this.setHoras(horas);
        this.setMinutos(minutos);

    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String toString() {
        return "Hora: " + this.horas + ":" + this.minutos;
    }



}
