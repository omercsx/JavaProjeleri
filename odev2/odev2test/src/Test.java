import RASTGELEKISIURET.RastgeleKisi;
import RASTGELEKISIURET.IMEINo;
import RASTGELEKISIURET.KimlikNo;
import RASTGELEKISIURET.Kisi;
import RASTGELEKISIURET.Kontrol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);
        int kisisayisi = 0;
        while(true){
            
            System.out.println("1-  Rastgele Kisi Üret");
            System.out.println("2-  Üretilmiş Dosya Kontrol Et");
            System.out.println("3-  Çıkış");
            System.out.println("Lütfen Seciminizi Giriniz");
            int secim = scanner.nextInt();
            if(secim == 3){
                System.out.println("Çıkılıyor...");
                break;
            }
            else if(secim == 1){
                System.out.println("Kaç Kişi Oluşturulsun?");
                int n = scanner.nextInt();
                Kisi kisi = new Kisi(n);
                kisisayisi = n;              
            }
            else if (secim == 2){
                RastgeleKisi rastgelekisi = new RastgeleKisi();
                System.out.println("T.C. Kimlik Kontrol");
                ArrayList<String> TCLER = new ArrayList<String>();
                TCLER = rastgelekisi.TCKN(kisisayisi);
                Kontrol kontrol = new Kontrol();
                kontrol.TCkontrol(TCLER);
                System.out.println("IMEI Kontrol");
                ArrayList<Long> IMEILER = new ArrayList<Long>();
                IMEILER = rastgelekisi.IMEI(kisisayisi);
                kontrol.IMEIkontrol(IMEILER);
            }
            else{
                System.out.println("Yanlış Seçim Girdiniz Lütfen Tekrar Deneyiniz.");
            }   
        }        
    }
}
