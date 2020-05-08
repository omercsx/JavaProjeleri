/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdp_odev1;

/**
 *
 * @author omerc
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class EmailDogrulayici {
    public int EmailSayisi =0;
    
    public EmailDogrulayici(String[] kelimeler) {
    
    for(int i = 0 ; i<kelimeler.length;i++)
    {
       
       Pattern pattern = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
       Matcher matcher = pattern.matcher(kelimeler[i]);
       if(matcher.matches()){
           EmailSayisi++;
       }
    }
   
  }
    
    
    
    
}
