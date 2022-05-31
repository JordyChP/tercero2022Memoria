/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamaniomemoria;

import org.github.jamm.MemoryMeter;

/**
 *
 * @author kali
 */
public class TamanioMemoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MemoryMeter meter = MemoryMeter.builder().build();
        System.out.println("----------------------------");
        System.out.println("String vacio");
        String N = "";
        System.out.println(meter.measureDeep(N));
        System.out.println("----------------------------");
        System.out.println("String lleno");
        String a = "Some tex";
        System.out.println(meter.measureDeep(a));
       

    }

}
