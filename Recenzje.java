import java.util.ArrayList;
import java.util.Random;

public class Recenzje {
    public static void main(String[] sdf){
        String content = new String();
        Integer licznik = 0;
        for (int i=0; i<Constants.liczbaRecenzji; i++){
            licznik++;
            content = content + licznik.toString() + ';' + getOcenaArtykulu().toString() + ';' + getIdArtykulu().toString()
                    + getIdStatusuRecenzji().toString() + ';' + getIdRecenzenta().toString() + ';' + getIdRedaktora() + '\n';
        }
        new ZapisDoPliku("Recenzje.csv", content);
    }
    
    static Integer getOcenaArtykulu(){
        return new Random().nextInt(Constants.skalaOcen);
    }
    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }
    static  Integer getIdStatusuRecenzji(){
        return new Random().nextInt(Constants.liczbaStatusArtykulu) + 1;
    }
    static Integer getIdRecenzenta(){
        return new Random().nextInt(Constants.liczbaRecenzetow) + 1;
    }
    static Integer getIdRedaktora(){
        return new Random().nextInt(Constants.liczbaRedaktorow) + 1;
    }
}
