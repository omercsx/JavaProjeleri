/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneodevi;
import java.util.logging.Level;
import java.util.logging.Logger;
import static nesneodevi.SicaklikAlgilayicisi.sicaklik;
/**
 *
 * @author omerc
 */
public class MerkeziIslemBirimi implements AkilliCihaz {
    
      public static int getSicaklik() {
        return sicaklik;
    }

    public static void setSicaklik(int sicaklik) {
        sicaklik = sicaklik;
    }

    @Override
    public void bekle() {
         try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void kapat() {
         try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    @Override
    public void algila() {
         try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

 

    @Override
    public void sogutucuyuKapatma() {
          try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    @Override
    public void SicakligiGonder() {
        MerkeziIslemBirimi mib = new MerkeziIslemBirimi();
        
        System.out.println("Sıcalık : "+ sicaklik);
      
    }

    @Override
    public int SicaklikOku() {
        return sicaklik;
       
    }

    @Override
    public void sogutucuyuAcma() {
          try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    @Override
    public void Arayuz() {
       
    }

    @Override
    public boolean Kontrol() {
       boolean control;
        if(sicaklik == 4){
            control = true;
        }
        else{
            control = false;
        }
        return control;
    }
    
}
