package nesneproje;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 
 * @author omerc
 */
public class MerkeziIslemBirimi extends AkilliCihaz {
    
    public static int sicaklik;
  
    public void SogutucuyuAcma(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean Kontrol(){
        boolean control;
        if(sicaklik == 4){
            control = true;
        }
        else{
            control = false;
        }
        return control;
    }
    public void SogutucuyuKapatma(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int SicaklikOku(){
        CevreselBirimler cevresel = new CevreselBirimler();
        int sicaklik = cevresel.SicaklikOku();    
        return sicaklik; 
    }
    
    public void SicaklikGonder(){
        MerkeziIslemBirimi mib = new MerkeziIslemBirimi();
        sicaklik = mib.SicaklikOku();
        System.out.println("Sıcalık : "+ sicaklik);
    }        
}
