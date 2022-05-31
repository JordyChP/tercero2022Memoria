/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamaniomemoria;

import org.github.jamm.MemoryMeter;

/**
 *
 * @author kali
 */
public class tamanioPrimitivos {

    public static void main(String[] args) {
        MemoryMeter meter = MemoryMeter.builder().build();
        byte N = 0 ;
        System.out.println(meter.measureDeep(N));
        byte a = 100;
        System.out.println(meter.measureDeep(a));
        System.out.println("----------------------");
        
        // 1 byte = 8 bit
        short s = 0 ;
        System.out.println(meter.measureDeep(s));
        short sh = 100;
        System.out.println(meter.measureDeep(sh)); 
        System.out.println("///////////////////////");
        
        long l = 0 ;
        System.out.println(meter.measureDeep(l));
        long lo = 254;
        System.out.println(meter.measureDeep(lo));
        
         System.out.println("///////////////////////");
        
        char d = ' ' ;
        System.out.println(meter.measureDeep(d));
        char cs = 3;
        System.out.println(meter.measureDeep(cs)); 
        System.out.println("************************************");
        int va = 0;
        System.out.println(meter.measureDeep(va));
        int llen = va + 2;
        System.out.println(meter.measure(llen));
               System.out.println("///////////////////////");
        
        boolean b = false ;
        System.out.println(meter.measureDeep(b));
        boolean bo = true;
        System.out.println(meter.measureDeep(bo));  
        
        double v = 0 ;
        System.out.println(meter.measureDeep(v));
        double t = 15.2;
        System.out.println(meter.measureDeep(t)); 
        
              
        float f = 0 ;
        System.out.println(meter.measureDeep(f));
        float as = 15;
        System.out.println(meter.measureDeep(as)); 
        String vacio[] = new String[0];
         System.out.println(meter.measureDeep(vacio)); 
        
        
    }

}
