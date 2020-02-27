/**
 *
 * @author omerc
 */
package kosullubki;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        /*
            BKİ = Kilo / (boy*boy)(m)
            bki <18.5 -- zayıf
            bki < 25 -- normal
            bki < 30 fazla kilolu
            bki >30 obez
        */
        Scanner scanner = new Scanner(System.in);
        int kilo;
        double boy;
        System.out.print("Kilonuzu Giriniz : ");
        kilo = scanner.nextInt();
        System.out.print("Boyunuzu giriniz (orn: 1,70) : ");
        boy = scanner.nextDouble();
        double bki;
        bki = kilo / (boy*boy);
        String durum;
        if(bki<18.5) durum = "Zayıf";           
        else if(bki<25) durum = "Normal";                   
        else if(bki<30) durum = "Fazla Kilulu";      
        else durum = "Obez";
        System.out.println("Beden Kitle Indeksiniz : " + bki);
        System.out.println("Durumunuz : " + durum);
        
        
    }
    
}
