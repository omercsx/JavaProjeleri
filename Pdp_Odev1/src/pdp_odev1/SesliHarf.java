package pdp_odev1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author omerc
 */
public class SesliHarf {
    public int sesliHarf = 0;
    public SesliHarf(String[] kelimeler){
        for(int i = 0; i<kelimeler.length;i++){
            if(kelimeler[i].length()>0){
                Pattern sesliPattern = Pattern.compile("[aeiouöıüÜAEİIOUÖ]");
                Matcher sesliMatcher = sesliPattern.matcher(kelimeler[i]);
                
                while(sesliMatcher.find()){
                    sesliHarf++;
                }
            }
        }
        
    }
    
}
