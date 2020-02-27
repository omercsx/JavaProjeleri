package benzinhesabı;

import java.util.Scanner;

public class BenzinHesabı{
    public static void main(String[] args)
    {
        /*
            Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre
            yol yaptığı bilgilerini alın ve 
            Sürücünün toplam ne kadar ödemesi gerektiğini hesaplayın
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Aracınız kilometrede kaç kuruş yakıyor? (Örnek : 0.32) : ");
        float kurus = scanner.nextFloat();
        System.out.print("Kaç Kilometre Yol Gittiniz ? : ");
        float km = scanner.nextFloat();
        float para = kurus * km;
        System.out.println("Ödemeniz Gereken ücret : "+ para +" tl");
        
    }
}