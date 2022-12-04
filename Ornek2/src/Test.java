
public class Test {

    public static void main(String[] args) {
        GPSAlicisi gA = new GPSAlicisi();
        while (gA.aktifMi == true) {
            Uydu uydu1 = new Uydu();
            Uydu uydu = new Uydu(gA);
            GPSProgrami gpsProgrami = new GPSProgrami(gA);
            break;
        }
    }

}
