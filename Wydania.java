import java.util.Random;

public class Wydania {
    public static void main(String[]asd){
        Integer licznik = 0;
        String content = new String();
        for (int i=0; i<Constants.liczbaWydan; i++){
            licznik++;
            content = content + licznik.toString() + ';' + getDate() + ';' + "CKM" + ';' + '\n';
        }
        new ZapisDoPliku("Wydania.txt", content);
    }
    static String getDate(){
        String dzien = new Integer(new Random().nextInt(28) + 1).toString();
        String miesiac = new Integer(new Random().nextInt(12) + 1).toString();
        String rok = new Integer(new Random().nextInt(100) + 1901).toString();
        return new String(dzien + '/' + miesiac + '/' + rok);
    }
}
