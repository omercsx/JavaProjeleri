/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdp_odev1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pdp_Odev1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        
        
        BufferedReader reader = new BufferedReader(new FileReader("icerik.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        char[] buffer = new char[10];
        while (reader.read(buffer) != -1) {
            stringBuilder.append(new String(buffer));
            buffer = new char[10];
        }
        reader.close();

        String icerik = stringBuilder.toString();
        
        String[] kelimeler = null;
        
        
        Pattern pattern = Pattern.compile(" ");
        kelimeler = pattern.split(icerik);
        

        //---------------------------
        // EMAIL SAYISI
        EmailDogrulayici email = new EmailDogrulayici(kelimeler);
        //---------------------------

        // Sesli harf bulma 
        // ---------------------------
        SesliHarf sesliharf = new SesliHarf(kelimeler);
        
        //----------------------------
        
        
        //----------------------------
        // Kelime Sayısı bulma
        int kelimesayisi = kelimeler.length + 1;// +1 yaptık çünkü for döngüsü 0'dan başlar
        
        
        //----------------------------
        
        //----------------------------
        //WEB SİTESİ SAYISI
        WebsiteSayisi web = new WebsiteSayisi(kelimeler);
        
        //----------------------------
        
        //----------------------------
        //CÜMLE SAYISI
        int cumlesayisi =0 ;
        
        for(int i = 0; i < kelimeler.length; i++) {
            
            Pattern pattern2 = Pattern.compile("\\.$", Pattern.CASE_INSENSITIVE);
            Matcher matcher2 = pattern2.matcher(kelimeler[i]);
            if(matcher2.find())
            {
                cumlesayisi++;
            }
        }
        
        //----------------------------
        System.out.println("Toplam Sesli Harf Sayısı : "+sesliharf.sesliHarf );
        System.out.println("Toplam Kelime Sayısı : " + kelimesayisi);
        System.out.println("Toplam Cümle Sayısı : "+ cumlesayisi);
        System.out.println("Toplam E-mail sayısı : "+email.EmailSayisi);
        System.out.println("Toplam Web Sitesi Sayısı : " + web.sayi);
        
        
       
    }
   
}
