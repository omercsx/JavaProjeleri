/**
 *
 * @author omerc
 */
package faizuygulamasi;

import java.util.Scanner;

public class FaizUygulamasi {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faiz oranımız %6'dır\n***********");
        int anapara,vade;
        System.out.print("Yatirmak istediğiniz tutar : ");
        anapara = scanner.nextInt();
        System.out.print("Paranizi kaç yıl vadeli yatırmak istiyorsunuz ? : ");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        
        double faizorani = 0.06;
        for(int i = 1 ;i<=10;i++){
            toplampara = (faizorani*toplampara) + toplampara;
            System.out.println(i+"yilin sonunda para miktari : "+toplampara);
        }
        
    }
    
}
