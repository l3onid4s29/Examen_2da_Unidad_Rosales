package dominio;

public class JPatronal extends Jubilado {

    public JPatronal() {
        
        super(null, null, 0, 0);
    }

    public double calcularPorPatronal(double PI, double salarioBase, int e1) {
        double Stotal = PI + (salarioBase * 0.02);
        
        if (e1 == 1) 
        {
            Stotal = (Stotal * 0.1) + Stotal;
        }  else if (e1 == 2) 
        {
            Stotal = (Stotal * 0.05) + Stotal;
        }

         return Stotal;
    }
}
