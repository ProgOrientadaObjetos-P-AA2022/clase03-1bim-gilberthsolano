/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        //agregar valores a los atributos h1 y h2 por teclado y final 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
//              
//        Hospital h1 = new Hospital();
//  System.out.println("Ingrese el nombre del hospital");
//              String nombre= ingreso.nextLine();
//      h1.establecerNombre(nombre);
//        System.out.println("Ingrese el numero de camas");
//        int numCamas= Integer.parseInt(ingreso.nextLine());
//        h1.establecerNumeroCamas(numCamas);
//        System.out.println("Ingrese el presupuesto");
//        double presupesto= Double.parseDouble(ingreso.nextLine());
//        h1.establecerPresupuesto(presupesto);
//        
//        Hospital h2 = new Hospital();
//        System.out.println("Ingrese el nombre del hospital");
//        String nombreHospital= ingreso.nextLine();
//        h2.establecerNombre(nombreHospital);
//        System.out.println("Ingrese el numero de camas");
//        int numcamasH= Integer.parseInt(ingreso.nextLine());
//        h2.establecerNumeroCamas(numCamas);
//        System.out.println("Ingre el presupuesto");
//        double presupuestoH= Double.parseDouble(ingreso.nextLine());
//        h2.establecerPresupuesto(presupuestoH);
//        
//        
//                        
//        System.out.printf("%s -%d -%.2f\n", h1.obtenerNombre(), h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
//        System.out.printf("%s -%d -%.2f\n", h2.obtenerNombre(), h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
         String nombreHospital;
        int camasHospital;
        double presupuestoHospital;
        
        System.out.println("Ingrese nombre hospital");
        nombreHospital = entrada.nextLine();
        
        System.out.println("Ingrese número de camas");
        camasHospital = entrada.nextInt();
        
        System.out.println("Ingrese presupuesto");
        presupuestoHospital = entrada.nextDouble();
                
        Hospital h1 = new Hospital();
        h1.establecerNombre(nombreHospital);
        h1.establecerNumeroCamas(camasHospital);
        h1.establecerPresupuesto(presupuestoHospital);
        entrada.nextLine();
        System.out.println("Ingrese nombre hospital(2)");
        nombreHospital = entrada.nextLine();
        
        System.out.println("Ingrese número de camas(2)");
        camasHospital = entrada.nextInt();
        
        System.out.println("Ingrese presupuesto(2)");
        presupuestoHospital = entrada.nextDouble();
        
        Hospital h2 = new Hospital();
        h2.establecerNombre(nombreHospital);
        h2.establecerNumeroCamas(camasHospital);
        h2.establecerPresupuesto(presupuestoHospital);
        
                        
        System.out.printf("%s \n", "Hola desde el main");
        
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
    }
    }
}
