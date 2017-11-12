import java.util.Random;

public class WyswietleniaGosci {
    public static void main(String[]asdd){
        String content = new String();
        for (int i=0; i<Constants.liczbaWyswietlenGosci; i++){
            content = content + getIdArtykulu().toString() + ';' + getIdGoscia().toString() + ';' + '\n';
        }
        new ZapisDoPliku("WyswietleniaGosci.txt", content);
    }
    static Integer getIdGoscia(){
        return new Random().nextInt(Constants.liczbaGosci) + 1;
    }
    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow);
    }
}
