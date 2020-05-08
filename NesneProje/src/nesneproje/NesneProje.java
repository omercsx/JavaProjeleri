
package nesneproje;

/**
 *
 * @author omercagri
 */
public class NesneProje {

    public static void main(String[] args) {
        // TODO code application logic here
        database db = new database();
        AgArayuzu arayuz = new AgArayuzu();
        int a= db.database_metodu("cagrisayir", "111111");
        if(a == 1){
            arayuz.arayuz();
        }
        else{
            System.out.println("HATA");
        }
    }
    
}
