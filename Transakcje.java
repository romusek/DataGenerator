import java.util.Random;

public class Transakcje {
    public static void main(String[]asd){
        String content = new String();
        Integer licznik = 0;
        for (int i=0; i<Constants.liczbaTransakcji; i++){
            licznik++;
            content = content + licznik.toString() + ';' + getDate() + ';' + getKwota() + ';' + getIdCzytelnika() + '\n';
        }
        new ZapisDoPliku("Transakcje.csv", content);
    }

    static String getDate(){
        Integer dzien = new Integer(new Random().nextInt(28) + 1);
        Integer miesiac = new Integer(new Random().nextInt(12) + 1);
        String rok = new Integer(new Random().nextInt(100) + 1901).toString();
        return new String(rok + (miesiac<10 ? "0" + miesiac.toString():miesiac.toString()) + (dzien<10 ? "0" +
                dzien.toString():dzien.toString()));//RRRRMMDD
    }
    static Double getKwota(){
        return Math.floor(new Random().nextDouble() * 100)/100.0;
    }
    static Integer getIdCzytelnika(){
        return new Random().nextInt(Constants.liczbaCzytelnikow) + 1;
    }
}
