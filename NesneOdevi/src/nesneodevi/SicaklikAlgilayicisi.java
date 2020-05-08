/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneodevi;

import java.util.Random;

/**
 *
 * @author omerc
 */
public class SicaklikAlgilayicisi implements AkilliCihaz {
    public static int sicaklik;
    
    
    @Override
    public void bekle() {
       
    }

    @Override
    public void kapat() {
      
    }

    @Override
    public void algila() {
      
    }

    @Override
    public int SicaklikOku() {
        Random rastgele = new Random();
        int sicaklikDegeri = rastgele.nextInt();
        int ilk2 = Integer.parseInt(Integer.toString(sicaklikDegeri).substring(0, 2));
        sicaklik = ilk2;
        return sicaklik;
    }

    @Override
    public void sogutucuyuKapatma() {
     
    }

    @Override
    public void sogutucuyuAcma() {
       
    }

    @Override
    public void SicakligiGonder() {
       
    }

    @Override
    public void Arayuz() {
       
    }

    @Override
    public boolean Kontrol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
