/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamaniomemoria;

import java.util.ArrayList;
import java.util.List;
import org.github.jamm.MemoryMeter;

/**
 *
 * @author kali
 */
public class LIsta {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        MemoryMeter meter = MemoryMeter.builder().build();
        for (int i = 0; i < 25; i++) {
            list.add("hola");

        }

        System.out.println(list);
        System.out.println(meter.measure(list));
        System.out.println("----------------------");
        List<String> lista = new ArrayList<>();
        System.out.println(meter.measureDeep(lista));
    }

}
