
public class GPSAlicisi {

    public GPSAlicisi() {
        int sicaklik = sicaklikOlc();
        if (sicaklik >= 5 && sicaklik <= 40) {
            aktifMi = true;
        } else {
            System.out.println("Sıcaklık yeterli değil!");
            aktifMi = false;
        }
        //System.out.println(sicaklik);
    }

    private int sicaklik;
    public boolean aktifMi;
    private String gpsCumlesi;

    private int sicaklikOlc() {
        this.sicaklik = rastgeleSayi();
        //System.out.println("sıcaklıkOlc() : "+this.sicaklik);
        return this.sicaklik;
    }

    public void uydudanVeriAl(int cumleCesidi) {
        //System.out.println("Uydudan veri al cumleCesidi : "+cumleCesidi);
        if (cumleCesidi == 1) {
            gpsCumlesi = "$GPGGA, N, 40, 30, E";
        } else if (cumleCesidi == 2) {
            gpsCumlesi = "$GPRMC, 41, N, E, 31";
        } else {
            gpsCumlesi = "$GPGLL, N, E, 42, 32";
        }

    }

    public String programaVeriGonder() {
        //System.out.println("Prgrama veri gönder : "+this.gpsCumlesi);
        return this.gpsCumlesi;
    }

    private int rastgeleSayi() {
        int rastgeleSayi = (int) (1 + (40) * Math.random());
        //System.out.println("rastgeleSayi() : "+rastgeleSayi);
        return rastgeleSayi;

    }

}
