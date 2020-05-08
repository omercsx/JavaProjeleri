package nesneproje;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omercagri
 */
public class AkilliCihaz {
    String HazirlayanSirket;
    String SurumTarihi;
    String CihazinAdi;
    
    public void bekle(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void kapat(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void algila(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SicaklikAlgilayicisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
