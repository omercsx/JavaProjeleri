/**
 *
 * @author omerc
 */
package basithesapmakinesi;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. Toplama İşlemi\n"
                          +"2. Çıkarma İşlemi\n"
                          +"3. Çarpma İşlemi\n"
                          +"4. Bölme İşlemi";
        System.out.println(islemler);
        int secilen;
        System.out.print("İşlem Seçiniz : ");
        secilen = scanner.nextInt();
        double sayi1,sayi2;
        System.out.print("Birinci Sayi : ");
        sayi1 = scanner.nextDouble();
        System.out.print("İkinci Sayi : ");
        sayi2 = scanner.nextDouble();
        double sonuc;
        switch(secilen){
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç = "+ sonuc);
                break;
            case 2:
                sonuc = sayi1-sayi2;
                System.out.println("Sonuç = "+ sonuc);
                break;
            case 3:
                sonuc = sayi1*sayi2;
                System.out.println("Sonuç = "+ sonuc);
                break;
            case 4:
                sonuc = sayi1 / sayi2 ; 
                System.out.println("Sonuç = "+ sonuc);
                break;
            default:
                System.out.println("Geçersiz işlem...");
        }
        
    }
    
}
