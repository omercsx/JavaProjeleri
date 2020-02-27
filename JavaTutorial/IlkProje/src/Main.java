import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı Giriniz : ");
        int yas = scanner.nextInt();
        scanner.nextLine();
        System.out.print("İsminizi Giriniz : ");
        String isim = scanner.nextLine();
        System.out.println("Yas "+ yas);
        System.out.println("İsim : "+ isim);
    }
}
