package dominio;

public class JVejez extends Jubilado {

    public JVejez() {
        
        super(null, null, 0, 0);
    }

    public double calcularPorVejez(double PI , double SalarioBase) 
    
    {
        double Stotal = PI + (SalarioBase *0.15);
        
        return Stotal;
    }
}
