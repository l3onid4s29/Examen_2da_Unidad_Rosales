package test;

import dominio.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class TestJubilados {

    static Scanner et;

    public static void main(String[] args) {
        ArrayList<Jubilado> jubilado = new ArrayList<>();

        double Discapacidad = 0;
        String nombre;
        String numCedula;
        double salarioBase = 0;
        int añosAporte = 0;
        double total = 0;
        int op2 = 0;
        int op1 = 0;
        String tipoJubilacion = null;
        et = new Scanner(System.in);

        while (op2 != 6) {
        op2 = 0;
        salarioBase = 0;
        añosAporte = 0;
        Discapacidad = 0;
        System.out.println();
           
            System.out.print("Ingrese el Nombre: ");
            nombre = et.nextLine();
            if (nombre.equals("Exit")) {
                System.out.println("");
                System.out.println("El programa se ha terminado de ejercutar");
                System.out.println("");
                op2 = 6;
                break;
                
            } else {
                System.out.print("Ingrese el numero de Cedula: ");
                numCedula = et.nextLine();
                System.out.print("Ingrese la pensión base: ");
                while (salarioBase <= 0) {
                    salarioBase = et.nextDouble();
                }
                System.out.print("Ingrese los años que aportó al seguro:");
                while (añosAporte <= 0) {
                    añosAporte = et.nextInt();
                }
                
                Jubilado j = new Jubilado(numCedula, nombre, salarioBase, añosAporte);
                double PI = j.calculoPensionInicial(añosAporte);

                System.out.println("");
                
                System.out.println("TIPOS DE JUBILACION ");
                System.out.println("1: Jubilacion por vejez");
                System.out.println("2: Jubilacion por discapacidad");
                System.out.println("3: Jubilacion Patronal");
                System.out.print("Ingrese el tipo de jubilación : ");
                while (op2 < 1 || op2 > 3) {
                    op2 = et.nextInt();
                }
                et.nextLine();
                switch (op2) {
                    case 1 -> {
                        tipoJubilacion = "Jubilacion por vejez";
                        JVejez v = new JVejez();
                        total = v.calcularPorVejez(PI, salarioBase);
                    }
                    case 2 -> {
                        tipoJubilacion = "Jubilacion por discapacidad";
                        System.out.println("");
                        System.out.println("JUBILACION POR DISCAPACIDAD");
                        JDiscapacidad d = new JDiscapacidad();
                        System.out.print("ingrese el porcentaje de discapacidad: ");
                        
                        while (Discapacidad > 100||Discapacidad <1 ) {
                            
                            Discapacidad = et.nextInt();
                        }
                   total = d.calcularPorDiscapacidad(PI, salarioBase, Discapacidad);
                        et.nextLine();
                    }
                    case 3 -> {
                        op1 = 0;

                        JPatronal p = new JPatronal();
                        
                        System.out.println("");
                        System.out.println(" JUBILACION PATRONAL ");
                        System.out.println("1: Empresa Privada");
                        System.out.println("2: Emresa Publica");
                        System.out.print("Ingrese tipo de empresa 1 o 2: ");
                        
                        while (op1 < 1 || op1 > 2) {
                         op1 = et.nextInt();
                        }
                        et.nextLine();
                        switch (op1) {
                            case 1 -> {
                                tipoJubilacion = "jubilacion Patronal: Privada";
                                System.out.println("");
                                System.out.println("Jubilacion Patronal:Empresa Privada ");

                            }
                            case 2 -> {
                                tipoJubilacion = "jubilacion Patronal: Publica";
                                System.out.println("");
                                System.out.println("Jubilacion Patronal:Empresa Publica ");
                            }
                        }
                        
                   total = p.calcularPorPatronal(PI, salarioBase, op1);

          }

       }
              
                System.out.println("Pension total de " + j.getNombre() + " es: " + total);
                System.out.println("");
                System.out.println("Registro de personas");
                jubilado.add(new Jubilado(numCedula, nombre, total, tipoJubilacion));
                Iterator ite;
                ite = jubilado.iterator();
                imprimir(ite);
            }
        }
    }
                public static void imprimir(Iterator ite) {
                while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}
