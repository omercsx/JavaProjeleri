/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneproje;
import java.sql.*;
/**
 *
 * @author omerc
 */
public class database {
    public int database_metodu(String username, String password){
        int kullanici = 1;
        try
        {   /***** Baglanti kurulumu *****/
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/G171210028DB",
                    "postgres", "52231453");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");

            String sql= "SELECT *  FROM \"_user\" WHERE \"username\"='"+username + "' and \"password\"='"+password +"'";

            /***** Sorgu çalıştırma *****/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            /***** Bağlantı sonlandırma *****/
            conn.close();


            if(rs.next())
            {
                System.out.println("Sayın "+username+" Girişiniz Yapıldı.");
                kullanici = 1;
            }
            else{
                System.out.println("Hatalı kullanıcı adı ya da şifre...");
                kullanici = 0;
            }
            
            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return kullanici;
    }
        
}
