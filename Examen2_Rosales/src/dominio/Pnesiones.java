package dominio;

public interface Pnesiones {

    int PenBasica = 400;

    default double Tiempo0_10() {
        double PI = (PenBasica*0.5);
        return PI;
    }

    default double Tiempo11_20() {
        double PI = (PenBasica*0.6);
        return PI;
    }

    default double Tiempo21_30() {
        double PI = (PenBasica*0.7);
        return PI;
    }

    default double Tiempo31_35() {
        double PI = (PenBasica*0.8);
        return PI;
    }

    default double Tiempo36_39() {
        double PI = (PenBasica*0.9);
        return PI;
    }

    default double Tiempo_40() {
        double PI = (PenBasica*1);
        return PI;
    }

}
