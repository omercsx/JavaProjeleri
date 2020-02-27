/**
 *
 * @author omerc
 */
package kullanici_giris;

import java.util.Scanner;

public class Kullanici_Giris {    
    public static void main(String[] args) {
        // while döngüsü yardımıyla bir kullanıcı girişi
        
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            String db_kullaniciAdi = "cagrisayir";
            String db_Sifre = "52231453";
            System.out.print("Kullanici Adiniz : ");
            String kullaniciAdi = scanner.nextLine();
            System.out.print("Sifreniz : ");
            String Sifre = scanner.nextLine();
            if(kullaniciAdi.equals(db_kullaniciAdi)&& Sifre.equals(db_Sifre)){
                
                System.out.println("Giriş Başarılı!");
                break;
            }
            else{
               System.out.println("Kullanici Adiniz veya Sifreniz yanlış!\n Lütfen Tekrar Deneyizin"); 
            }
            
        }
        
        
        
    }
    
}
