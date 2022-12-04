
public class Uydu {

    public Uydu() {
        System.out.println("!Uyarı\nYapıcı metodun bir paramteresi yok.");
    }

    public Uydu(GPSAlicisi gA) {
        System.out.println("GPS Alıcısına Bağlantı : Aktif");
        int veri = veriTuruSec();
        //System.out.println("uydu"+veri);
        gA.uydudanVeriAl(veri);

    }

    private int veriTuruSec() {
        int sayi = (int) (1 + (3) * Math.random());
        return sayi;
    }
}
