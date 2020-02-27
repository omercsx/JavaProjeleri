/**
 *
 * @author omerc
 */
package atmprogrami;

import java.util.Scanner;


public class ATMProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.islem : Bakiye Ogrenme\n"
                +"2. Islem : Para Cekme\n"
                +"3. Islem : Para Yatırma\n"
                +"Cikis icin 'q'ya basiniz..";
        System.out.println("-*************************-");
        System.out.println(islemler);
        
        System.out.println("-*************************-");
        while(true)
        {
            System.out.println("Islemi seciniz : ");
            String islem = scanner.nextLine();
            if(islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            }
            else if(islem.equals("1"))
            {   
                System.out.println("Bakiyeniz : "+bakiye);
                
            }
            else if(islem.equals("2"))
            {
                int cekilecek;
                System.out.println("Cekmek istediginiz tutarı giriniz :");
                cekilecek = scanner.nextInt();
                scanner.nextLine();
                if(cekilecek > bakiye){
                    System.out.println("Hesabinizda o kadar para bulunmamaktadir");
                    
                }
                else
                {
                    bakiye = bakiye - cekilecek;
                    System.out.println("Yeni bakiyeniz = "+ bakiye);
                }
            }
            else if(islem.equals("3"))
            {
                System.out.println("Yatirmak istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye +=tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                
            }
            else{
                System.out.println("Gecersiz islem girdiniz...\n Lutfen yeniden giriniz...");
            }
            
        }
        
        
            
    }
    
}
