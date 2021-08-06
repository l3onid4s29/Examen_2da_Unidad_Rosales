package dominio;

public class JDiscapacidad extends Jubilado {

    
    public JDiscapacidad() {
        
        super(null, null, 0, 0);
    }

    public double calcularPorDiscapacidad(double PI, double salarioBase, double porDiscapacidad) {
        
        double Stotal = PI + (salarioBase *porDiscapacidad *0.01);
        return Stotal;

    }
}
