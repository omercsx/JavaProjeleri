
package RASTGELEKISIURET;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author kcavd
 */
public class Kontrol {
    
    public static void DosyaOkuma(int n) throws InterruptedException, IOException, FileNotFoundException{
        KimlikNo kimlikkontrol = new KimlikNo();
        BufferedReader reader = new BufferedReader(new FileReader("Kisiler.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        char[] buffer = new char[10];
        while (reader.read(buffer) != -1) {
            stringBuilder.append(new String(buffer));
            buffer = new char[10];
        }
        reader.close();

        String icerik = stringBuilder.toString();

        String[] kelimeler = null;
        ArrayList<String> KelimeList = new ArrayList<String>();
        ArrayList<String> TCKNKelimeList = new ArrayList<String>();
        
        Pattern pattern = Pattern.compile(" ");
        kelimeler = pattern.split(icerik);
        for(int i =0; i<kelimeler.length;i++){
            KelimeList.add(kelimeler[i]);
        }
        for(int i =0; i<kelimeler.length;i++){
            if(i%5==0){
                TCKNKelimeList.add(KelimeList.get(i));
            }   
        }
    }
    public static void TCkontrol(ArrayList<String> TCLER){
        KimlikNo kimlik = new KimlikNo();
        for(int i =0;i<TCLER.size();i++){
            if(kimlik.isTCKN(TCLER.get(i))){
                String son3 = TCLER.get(i).substring(TCLER.get(i).length()-3);
                System.out.println(son3+"\t"+"Geçerli");
            }
            else{
                String son3 = TCLER.get(i).substring(TCLER.get(i).length()-3);
                System.out.println(son3+"\t"+"Geçersiz");
            }   
        }       
    }   
    public static void IMEIkontrol(ArrayList<Long> imeiler){
        IMEINo imei = new IMEINo();
        for(int i =0;i<imeiler.size();i++){
            if(imei.isValidIMEI(imeiler.get(i))){
                String son3 = imeiler.get(i).toString().substring(imeiler.get(i).toString().length()-3);
                System.out.println(son3+"\t"+"Geçerli");
            }
            else{
                String son3 = imeiler.get(i).toString().substring(imeiler.get(i).toString().length()-3);
                System.out.println(son3+"\t"+"Geçersiz");
            }               
        }       
    }    
}