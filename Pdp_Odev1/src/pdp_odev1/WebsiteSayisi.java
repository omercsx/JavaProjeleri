
package pdp_odev1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author omer cagri sayir
 */
public class WebsiteSayisi {
    public int sayi = 0;
    public WebsiteSayisi(String[] kelimeler){ 
        
        for(int i = 0;i<kelimeler.length;i++){
            Pattern p = Pattern.compile("^(https?:\\/\\/)?(www\\.)?([\\w]+\\.)+[‌​\\w]{2,63}\\/?$");
            Matcher m;
            m=p.matcher(kelimeler[i]);
            if(m.find()){
                sayi++;
            }
        }
        
    }
    
    
}
