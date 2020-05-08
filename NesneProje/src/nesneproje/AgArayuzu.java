package nesneproje;

import java.util.Scanner;

/**
 *
 * @author omerc
 */
public class AgArayuzu extends CevreselBirimler {
    
    public void arayuz(){
        
        while(true){
            int secim;
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Hoşgeldiniz..");
            System.out.println("1. Soğutucuyu Aç");
            System.out.println("2. Sıcaklığı Görüntüle");
            System.out.println("3. Soğutucuyu Kapat");
            System.out.println("4. Çıkış");
            System.out.print("Bir işlem seçiniz : ");
            secim = scanner.nextInt();
            if(secim == 4){
                break;
            }
            else if(secim == 1){
                Eyleyici eyleyici = new Eyleyici();
                AkilliCihaz ac = new AkilliCihaz();
                ac.algila();
                eyleyici.SogutucuyuAcma();
            }
            else if(secim == 2){
                MerkeziIslemBirimi mib = new MerkeziIslemBirimi();
                AkilliCihaz ac = new AkilliCihaz();
                ac.bekle();
                mib.SicaklikGonder();
            }
            else if(secim == 3){
                Eyleyici eyleyici = new Eyleyici();
                AkilliCihaz ac = new AkilliCihaz();
                ac.kapat();
                eyleyici.SogutucuyuKapatma();            
            }
            else{
                System.out.println("Geçersiz Değer Girdiniz...");
            }
        }
    }
    @Override
    public void SogutucuyuAcma(){
        
    }
    
    @Override
    public void SogutucuyuKapatma(){
        
    }
}
