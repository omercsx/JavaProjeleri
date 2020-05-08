/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RASTGELEKISIURET;


import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author kemalc
 */

public class Rastgele {
    public static int RastgeleKisiAd(){
        int KisiAdNo = (int) ((System.currentTimeMillis()%3000)+0);
        return KisiAdNo;
    }
    
    public static int RastgeleKisiYas(){
        int KisiAdYas = (int) ((System.currentTimeMillis()%100)+0);
        return KisiAdYas;
    }
    
    public static String RastgeleTC(){
        ThreadLocalRandom rastgele = ThreadLocalRandom.current();
        Long temp = rastgele.nextLong(10_000_000_000L, 100_000_000_000L);
        String TC = temp.toString();
        return TC;
    }
    public static Long RastgeleIMEI(){
        ThreadLocalRandom rastgele = ThreadLocalRandom.current();
        return rastgele.nextLong(100_000_000_000_000L, 1_000_000_000_000_000L);   
    }    
    public static String RastgeleTel(){
        ThreadLocalRandom rastgele = ThreadLocalRandom.current();
        Long temp = rastgele.nextLong(100_000_000L, 1_000_000_000L);
        String Tempstring = "05"+temp.toString();
        return Tempstring;      
    }
  
}
