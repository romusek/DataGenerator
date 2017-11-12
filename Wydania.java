import java.util.Random;

public class Wydania {
    public static void main(String[]asd){
        Integer licznik = 0;
        String content = new String();
        for (int i=0; i<Constants.liczbaWydan; i++){
            licznik++;
            content = content + licznik.toString() + ';' + getDate() + ';' + "wiedza i zycie" + '\n';
        }
        new ZapisDoPliku("Wydania.csv", content);
    }
    static String getDate(){
        Integer dzien = new Integer(new Random().nextInt(28) + 1);
        Integer miesiac = new Integer(new Random().nextInt(12) + 1);
        String rok = new Integer(new Random().nextInt(100) + 1901).toString();
        return new String(rok + (miesiac<10 ? "0" + miesiac.toString():miesiac.toString()) + (dzien<10 ? "0" +
                dzien.toString():dzien.toString()));//RRRRMMDD
    }
}
