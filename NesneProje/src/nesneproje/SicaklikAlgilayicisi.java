package nesneproje;


import java.util.Random;

/**
 *
 * @author omerc
 */
public class SicaklikAlgilayicisi extends CevreselBirimler {
    
    @Override
    public int SicaklikOku(){
        
        Random random = new Random();
        int sicaklikDegeri = random.nextInt();
        int first2Digit = Integer.parseInt(Integer.toString(sicaklikDegeri).substring(0, 2));
        sicaklik = first2Digit;
        return sicaklik;
    }
    
    
}
