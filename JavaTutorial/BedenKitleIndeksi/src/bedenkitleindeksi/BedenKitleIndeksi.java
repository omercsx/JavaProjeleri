/**
 *
 * @author omerc
 */
package bedenkitleindeksi;

import java.util.Scanner;

public class BedenKitleIndeksi {   
    public static void main(String[] args) {
        // Beden Kitle Indeksi = Kilo / (Boy(m) * Boy(m))
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kilonuzu Giriniz : ");
        int kilo = scanner.nextInt();
        
        System.out.print("Boyunuzu Giriniz : ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy*boy);
        System.out.println("Beden Kitle Indeksiniz : "+ bki);
    }
    
}
