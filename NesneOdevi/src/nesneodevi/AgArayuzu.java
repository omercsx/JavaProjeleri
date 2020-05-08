/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneodevi;
import java.util.Scanner;
/**
 *
 * @author omerc
 */
public class AgArayuzu  implements AkilliCihaz {

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
       return 0;
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
         while(true){
            int secim;
            Scanner tarama = new Scanner(System.in);
            
            System.out.println("Hoşgeldiniz..");
            System.out.println("1. Soğutucuyu Aç");
            System.out.println("2. Sıcaklığı Görüntüle");
            System.out.println("3. Soğutucuyu Kapat");
            System.out.println("4. Çıkış");
            System.out.print("Bir işlem seçiniz : ");
            secim = tarama.nextInt();
            if(secim == 4){
                break;
            }
            else if(secim == 1){
                Eyleyici eyleyici = new Eyleyici();
                MerkeziIslemBirimi mib = new  MerkeziIslemBirimi();
                mib.algila();
                eyleyici.sogutucuyuAcma();
              
            }
            else if(secim == 2){
                MerkeziIslemBirimi mib = new MerkeziIslemBirimi();
                mib.bekle();
                mib.SicakligiGonder();
                
            }
            else if(secim == 3){
                Eyleyici eyleyici = new Eyleyici();
                MerkeziIslemBirimi ac = new MerkeziIslemBirimi();
                ac.kapat();
                eyleyici.sogutucuyuKapatma();            
              
            }
            else{
                System.out.println("Geçersiz Değer Girdiniz...");
            }
        }
       
    }

    @Override
    public boolean Kontrol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void arayuz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
