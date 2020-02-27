package Test;

import java.util.Scanner;
// Kullanıcıdan aldığınız iki sayının Değerlerini Değiştirin
public class DegiskenDegeriDegistirme {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;
        
        System.out.print("Birinci Sayi : ");
        birinci_sayi = scanner.nextInt();
        System.out.print("ikinci Sayi : ");
        ikinci_sayi = scanner.nextInt();
        
        int temp = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = temp;
        System.out.println("Birinci Sayi : "+birinci_sayi);
        System.out.println("ikinci_sayi : "+ikinci_sayi);
    }
    
}
