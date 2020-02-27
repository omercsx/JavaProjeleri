package hipotenus;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        int kenar1;
//        int kenar2;
//        System.out.print("Birinci kenar : ");
//        kenar1 = scanner.nextInt();
//        System.out.print("İkinci Kenar : ");
//        kenar2 = scanner.nextInt();
//        double h = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
//        System.out.println("Hipotenus = "+ h);
//        
        Scanner scanner = new Scanner(System.in);
        int kenar1, kenar2;
        System.out.print("Birinci Kenar : ");
        kenar1 = scanner.nextInt();
        System.out.print("İkinci Kenar : ");
        kenar2 = scanner.nextInt();
        double h = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
        System.out.println("Hipotenüs = " + h);
        
        
    }
    
}
