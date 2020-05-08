
package RASTGELEKISIURET;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kcavd
 */
public class Kisi {
    

    public Kisi(int n) throws InterruptedException, IOException {
        RastgeleKisi kisi = new RastgeleKisi();
        ArrayList<String> TCKNList = new ArrayList<String>();
        ArrayList<String> isimList = new ArrayList<String>();
        ArrayList<Integer> YasList = new ArrayList<Integer>();
        ArrayList<String> TelList = new ArrayList<String>();
        ArrayList<Long> IMEIList = new ArrayList<Long>();
        TCKNList = kisi.TCKN(n);
        isimList = kisi.RastgeleAd(n);
        YasList = kisi.Yas(n);
        TelList = kisi.Telefon(n);
        IMEIList = kisi.IMEI(n);
        
        File file = new File("Kisiler.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter); 
        
        for(int i=0;i<n;i++){
            ArrayList<String> KisiList = new ArrayList<String>();
            KisiList.add(TCKNList.get(i));
            KisiList.add(isimList.get(i));
            KisiList.add(YasList.get(i).toString());
            KisiList.add(TelList.get(i));
            KisiList.add(IMEIList.get(i).toString());
            
            
            
            for(int j =0;j<KisiList.size();j++){
                if(j==4){
                    bWriter.write("(");
                    bWriter.write(KisiList.get(j));
                    bWriter.write(")");
                }
                else{
                    bWriter.write(KisiList.get(j));
                    bWriter.write(" ");
                }
                
            }
            
            bWriter.write("\n");
        }
        
        bWriter.close();
        
    }
    
}
