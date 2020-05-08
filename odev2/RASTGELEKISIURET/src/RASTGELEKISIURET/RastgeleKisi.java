
package RASTGELEKISIURET;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import RASTGELEKISIURET.Rastgele;


/**
 *
 * @author kemalc
 */
 

public class RastgeleKisi {
    
    public static ArrayList<String> RastgeleAd(int n) throws InterruptedException{

        // DOSYA OKUMA 
        BufferedReader reader;
        ArrayList<String> KisiAdlari = new ArrayList<String>();
        ArrayList<String> SecilenKisiler = new ArrayList<String>();
    try 
        {
            reader = new BufferedReader(new FileReader("random_isimler.txt"));
            String line = reader.readLine();
            while (line != null){
            KisiAdlari.add(line);
            line = reader.readLine();
            }
            reader.close();       
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    
        for(int i = 0; i<n;i++){
            
            SecilenKisiler.add(KisiAdlari.get(Rastgele.RastgeleKisiAd()));
            Thread.sleep(10);
        }
        return SecilenKisiler;
    }
    
    public static ArrayList<Integer> Yas (int n) throws InterruptedException{
        ArrayList<Integer> KisiYaslari = new ArrayList<Integer>();
        for(int i = 0; i<n;i++){
            
            KisiYaslari.add(Rastgele.RastgeleKisiYas());
            Thread.sleep(10);
        }
        return KisiYaslari;
    }
    
    public static ArrayList<String> TCKN (int n){
        ArrayList<String> KisiTCKN = new ArrayList<String>();
        for(int i = 0; i<n;i++){
            
            KisiTCKN.add(Rastgele.RastgeleTC());
            
        }
        return KisiTCKN;
    }
    
    public static ArrayList<Long> IMEI (int n){
        ArrayList<Long> KisiIMEI = new ArrayList<Long>();
        for(int i = 0; i<n;i++){
            
            KisiIMEI.add(Rastgele.RastgeleIMEI());       
        }
        return KisiIMEI;
    }
    public static ArrayList<String> Telefon (int n){
        ArrayList<String> KisiTel = new ArrayList<String>();
        for(int i = 0; i<n;i++){
            
            KisiTel.add(Rastgele.RastgeleTel());
            
        }
        return KisiTel;
    }    
}
    
    
    
    
    

