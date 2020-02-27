/**
 *
 * @author omerc
 */
package armstrong_sayisi;

import java.util.Scanner;

public class Armstrong_Sayisi {

    public static void main(String[] args) {
        /*
            Armstron sayisi olup olmadığını bulan program
            1634 = 1^4 + 6^4 + 3^4 + 4^4 ( Burada üzeri 4 basamak sayisidir)
            371 = 3^3 + 7^3 + 1^3 ( 3 basamak sayısı)
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi Giriniz : ");
        int sayi = scanner.nextInt();
        System.out.println("Basamak Sayisi : ");
        int basamak = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        do{
            int basamak_degeri = gecici_sayi %10;
            gecici_sayi = gecici_sayi / 10;
            toplam += Math.pow(basamak_degeri, basamak);
            
        }while(gecici_sayi > 0);
        if(sayi == toplam){
            System.out.println("Bu sayi bir armstrong sayisidir");
            
        }
        else {
            System.out.println("Bu sayi bir armstrong sayisi değildir");
        }
        
    }
    
}
