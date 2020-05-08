/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneodevi;

import static nesneodevi.SicaklikAlgilayicisi.sicaklik;

/**
 *
 * @author omerc
 */
public class Eyleyici  implements AkilliCihaz {

   

    @Override
    public void bekle() {}

    @Override
    public void kapat() { }

    @Override
    public void algila() { }

    @Override
    public int SicaklikOku() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sogutucuyuKapatma() {
            System.out.println("SOĞUTUCU KAPATILIYOR...");
      }

    @Override
    public void sogutucuyuAcma() {
        SicaklikAlgilayicisi sicaklikalgilayicisi = new SicaklikAlgilayicisi();
        
        if(sicaklik != 4){
            System.out.println("SOĞUTUCU AÇILIYOR...");
            System.out.println("Önceki sicaklik :" + sicaklik);
            sicaklik = 4;
            System.out.print("Sicaklik ideal dereceye gelmiştir");
            System.out.println("Sıcaklık : " + sicaklik);
        }
        else{
            
            System.out.println(sicaklik + "Soğutucu ideal derecede");
        }   
    
    
    }

    @Override
    public void SicakligiGonder() {  }

    @Override
    public void Arayuz() { }

    @Override
    public boolean Kontrol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class sicaklikalgilayicisi {

        public sicaklikalgilayicisi() {
        }
    }
    
}
