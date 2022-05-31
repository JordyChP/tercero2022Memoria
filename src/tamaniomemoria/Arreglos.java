/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamaniomemoria;

import javax.swing.JOptionPane;
import org.github.jamm.MemoryMeter;

/**
 *
 * @author kali
 */
public class Arreglos {

    public static void main(String[] args) {
        MemoryMeter meter = MemoryMeter.builder().build();
//         String nombre = "";
//         String datos[];
//         String datosV[] = new String[0];
//         System.out.println(meter.measureDeep(datosV));
//         datos = new String[4];
//         int i = 0;
//         while (i < 4) {           
//            nombre = JOptionPane.showInputDialog("Ingrese el nombre");
//            datos[i] = nombre;
//            i++;   
//        } 
        //   System.out.println(meter.measure(datos));
        System.out.println("------------------------------------------");
        int a = 15;
        int inm[] = new int[0];
        System.out.println(meter.measureDeep(inm));
        int nu[] = new int[3];
        for (int i = 0; i < nu.length; i++) {
            System.out.println(a);
        }
        System.out.println(meter.measureDeep(nu));

    
//        System.out.println("----------------------------------------------");
//        System.out.println("------------------------------------------");
//        float inum[] = new float[0];
//        System.out.println(meter.measureDeep(inum));
//        float num[] = new float[5];
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(100);
//        }
//        System.out.println(meter.measureDeep(num));
//        System.out.println("----------------------------------------------");
//        System.out.println("------------------------------------------");
//        double inum[] = new double[0];
//        System.out.println(meter.measureDeep(inum));
//        double num[] = new double[5];
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(100);
//        }
//        System.out.println(meter.measureDeep(num));

    System.out.println (

    "----------------------------------------------");
    System.out.println (
    "------------------------------------------");
        char inum[] = new char[0];

    System.out.println (meter.measureDeep
    (inum));
        char num[] = new char[3];
    for (int i = 0;
    i< num.length ;
    i

    
        ++) {
            System.out.println("a");
    }

    System.out.println (meter.measureDeep

(num));

    }

}
