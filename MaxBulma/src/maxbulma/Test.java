
package maxbulma;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, sayi3;
        System.out.print("Birinci Sayi : ");
        sayi1 = scanner.nextInt();
        System.out.print("Ikinci Sayi : ");
        sayi2 = scanner.nextInt();
        System.out.print("Ucuncu Sayi : ");
        sayi3 = scanner.nextInt();
        int max;
        max = sayi1;
        if(sayi2>sayi1)
        {
            max = sayi2;
            if(sayi3>sayi2)
            {
                max = sayi3;
            }
        }
        if(sayi3>sayi1)
        {
            max = sayi3;
        }
        System.out.println("En buyuk sayi = "+max);
        
    }
    
}
