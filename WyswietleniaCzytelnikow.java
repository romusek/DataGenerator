import java.util.Random;

public class WyswietleniaCzytelnikow {
    public static void main(String[]asdd){
        String content = new String();
        for (int i=0; i<Constants.liczbaWyswietlenCzytelnikow; i++){
            content = content + getIdCzytelnika().toString() + ';' + getIdArtykulu().toString() + ';' + getDate() + ';' + '\n';
        }
        new ZapisDoPliku("WyswietleniaCzytelnikow.txt", content);
    }
    static Integer getIdCzytelnika(){
        return new Random().nextInt(Constants.liczbaCzytelnikow) + 1;
    }
    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow);
    }
    static String getDate(){
        String dzien = new Integer(new Random().nextInt(28) + 1).toString();
        String miesiac = new Integer(new Random().nextInt(12) + 1).toString();
        String rok = new Integer(new Random().nextInt(100) + 1901).toString();
        return new String(dzien + '/' + miesiac + '/' + rok);
    }
}
