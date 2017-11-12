import java.util.Random;

public class SlowaKluczoweArtykulow {
    public static void main(String[]asd){
        String content = new String();
        for (int i=0; i<Constants.liczbaSlowKluczowychArtykolow; i++){
            content = content + getIdSlowoKluczowe().toString() + ';' + getIdArtykulu() + ';' + '\n';
        }
        new ZapisDoPliku("SlowaKluczoweArtykulow.txt", content);
    }

    static Integer getIdSlowoKluczowe(){
        return new Random().nextInt(Constants.liczbaSlowKluczowych) + 1;
    }
    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow);
    }
}
