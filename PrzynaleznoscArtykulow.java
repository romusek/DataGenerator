import java.util.Random;

public class PrzynaleznoscArtykulow {
    public static void main(String[] as){
        String content = new String();
        for (int i=0; i<Constants.liczbaPrzynaleznosciArtykulow; i++){
            content = content + getIdKategorii() + ';' + getIdArtykulu() + ';' + '\n';
        }
        new ZapisDoPliku("PrzynaleznoscArtykulow.txt", content);
    }
    static Integer getIdKategorii(){
        return new Random().nextInt(Constants.liczbaKategorii) + 1;
    }
    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }
}
