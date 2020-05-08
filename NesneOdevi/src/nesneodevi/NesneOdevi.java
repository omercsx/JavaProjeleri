/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneodevi;

import java.util.Scanner;

/**
 *
 * @author omerc
 */
public class NesneOdevi {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi;
         System.out.print("Kullanici adiniz : ");
        kullaniciAdi = scanner.nextLine();
        String sifre;
         System.out.print("Sifreniz : ");
         sifre = scanner.nextLine();
        java.sql.Connection  conn =  database.getdatabase(kullaniciAdi, sifre);
        AgArayuzu aa = new AgArayuzu();
       
        if(conn != null){
            aa.Arayuz();
        }
        else{
            System.out.println("HATA");
        }
        
    }
    
}
