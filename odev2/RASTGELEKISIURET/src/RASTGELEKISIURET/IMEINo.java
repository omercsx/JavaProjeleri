/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RASTGELEKISIURET;

import static RASTGELEKISIURET.KimlikNo.isTCKN;
import java.util.ArrayList;


/**
 *
 * @author kcavd
 */

public class IMEINo {
    
    public static ArrayList<Boolean> control(ArrayList<Long> IMEI){
        ArrayList<Boolean> IMEIDurumu = new ArrayList<Boolean>();
        boolean isTrue = false;
        for(int i =0;i<IMEI.size();i++){
            IMEIDurumu.add(isValidIMEI(IMEI.get(i)));
            
        }
        return IMEIDurumu;
    } 
    
    static int sumDig(int n) 
    { 
        int a = 0; 
        while (n > 0) 
        { 
            a = a + n % 10; 
            n = n / 10; 
        } 
        return a; 
    } 
  
    static boolean isValidIMEI(long n) 
    { 
        // Uzunluğu bulmak için sayıları Stringe çeviriyoruz
        
        String s = Long.toString(n); 
        int len = s.length(); 
  
        if (len != 15) 
            return false; 
  
        int sum = 0; 
        for (int i = len; i >= 1; i--) 
        { 
            int d = (int)(n % 10); 
  
            // her alternatif basamağı ikiye katladık
            if (i % 2 == 0) 
                d = 2 * d; 
  
            // Basamakların toplamını buluyoruz
            sum += sumDig(d); 
            n = n / 10; 
        } 
  
        return (sum % 10 == 0); 
    } 
}
