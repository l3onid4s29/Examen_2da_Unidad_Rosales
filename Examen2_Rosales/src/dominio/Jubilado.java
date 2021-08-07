package dominio;

public class Jubilado implements Pnesiones {

    private String numCedula;
    private String nombre;
    private double salarioBase;
    private int añosAporte;
    private String tipoJubilacion;
    private double pensionTotal;

    public Jubilado(String numCedula, String nombre, double salarioBase, int anñosAporte) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.añosAporte = añosAporte;
    }

    public double calculoPensionInicial(int añosAporte) {
        double PI = 0;
        if (añosAporte <= 10) {
          PI = Tiempo0_10();
        } else if (añosAporte <= 20 && añosAporte >= 11) 
        {
          PI = Tiempo11_20();
        } else if (añosAporte <= 30 && añosAporte >= 21) 
        {
          PI = Tiempo21_30();
        } else if (añosAporte <= 35 && añosAporte >= 31) 
        {
          PI = Tiempo31_35();
        } else if (añosAporte <= 39 && añosAporte >= 36) 
        {
          PI = Tiempo36_39();
        } else if (añosAporte >= 40) 
        {
          PI = Tiempo_40();
        }
        return PI;
    }

    public Jubilado(String numCedula, String nombre, double pensionTotal, String tipoJubilacion) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.pensionTotal = pensionTotal;
        this.tipoJubilacion = tipoJubilacion;
    }

    public String getNombre() {
        return nombre;
    }
    
     public double getPensionTotal() {
        return pensionTotal;
    }

    public int getAñosAporte() {
        return añosAporte;
    }

   

    @Override
    public String toString() {
        return"Nombre:" + this.nombre + "\n Numero de cédula: " + this.numCedula + "\n Tipo de jubilación: " + this.tipoJubilacion + "\n Pensión total " + this.pensionTotal;
    }

}
