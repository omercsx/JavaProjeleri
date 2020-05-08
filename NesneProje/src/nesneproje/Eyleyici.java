package nesneproje;
/**
 *
 * @author omercagris
 */
public class Eyleyici extends CevreselBirimler {
    
    @Override
    public void SogutucuyuAcma(){
        SicaklikAlgilayicisi sicaklikalgilayicisi = new SicaklikAlgilayicisi();
        sicaklik = sicaklikalgilayicisi.SicaklikOku();
        if(sicaklik != 4){
            System.out.println("SOĞUTUCU AÇILIYOR...");
            System.out.println("Önceki sicaklik :" + sicaklik);
            sicaklik = 4;
            System.out.print("Sicaklik ideal dereceye gelmiştir");
            System.out.println("  Sıcaklık : " + sicaklik);
        }
        else{
            
            System.out.println(sicaklik + "Soğutucu ideal derecede");
        }   
    }
    @Override
    public void SogutucuyuKapatma(){
        System.out.println("SOĞUTUCU KAPATILIYOR...");
       
    }
}
