
public class GPSProgrami {

    String[] sayilar = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public GPSProgrami(GPSAlicisi gA) {
        String veri = gA.programaVeriGonder();
        //System.out.println("GPSProgrami(gA) : "+veri);
        konumBilgisi(veri);
    }

    private String konumVerisi;
    private String enlem;
    private String boylam;

    private void konumBilgisi(String konumVerisi) {

        this.konumVerisi = konumVerisi;
        String replace = this.konumVerisi.replace(" ", "");
        System.out.println(replace);
        String[] veri = replace.split(",");
        String[] yeniVeri = {veri[1], veri[2], veri[3], veri[4]};
        String[] enBoy;
        enBoy = new String[2];
        int eleman = 0;
        for (String yeniVeri1 : yeniVeri) {
            for (String sayilar1 : sayilar) {
                if (yeniVeri1.startsWith(sayilar1)) {
                    enBoy[eleman] = yeniVeri1;
                    eleman++;
                }
            }
        }
        
        this.enlem = enBoy[0];
        this.boylam = enBoy[1];
        System.out.println("GPS türü : " + veri[0]
                + "\nEnlem : " + this.enlem
                + "\nBoylam : " + this.boylam);
    }
}
