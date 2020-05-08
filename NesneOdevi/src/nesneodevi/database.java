
package nesneodevi;

/**
 *
 * @author omerc
 */
import java.sql.*;

public class database {
    static Connection conn=null;
    
    
    private database() {
        
    }
    public static  Connection getdatabase(String username, String password){
       // int kullanici = 1;
        try
        {   /***** Baglanti kurulumu *****/
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/G171210028DB", "postgres", "52231453");
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
                
              
            }
            else{
                System.out.println("Hatalı kullanıcı adı ya da şifre...");
               conn = null;
            }
            
            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
   
    
}
