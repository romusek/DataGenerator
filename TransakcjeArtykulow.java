import java.util.Random;

public class TransakcjeArtykulow {
    public static void main(String[] asdd){
        Integer licznik = 0;
        String content = new String();
        for (int i=0; i<Constants.liczbaTransakcji; i++){
            licznik++;
            content = content + licznik.toString() + ';' + getIdArtykulu().toString() + ';' + getDate() + ';' + '\n';
        }
        new ZapisDoPliku("TransakcjeArtykulow.txt", content);
    }

    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }
    static String getDate(){
        String dzien = new Integer(new Random().nextInt(28) + 1).toString();
        String miesiac = new Integer(new Random().nextInt(12) + 1).toString();
        String rok = new Integer(new Random().nextInt(100) + 1901).toString();
        return new String(dzien + '/' + miesiac + '/' + rok);
    }
}
