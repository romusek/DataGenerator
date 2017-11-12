import java.util.Random;

public class ZrodlaArtykulow {
    public static void main(String[]asd){
        String content = new String();
        for (int i=0; i<Constants.liczbaZrodelArtykulow; i++){
            content = content + getIdArtykulu().toString() + ';' + getIdZrodla() + ';' + '\n';
        }
        new ZapisDoPliku("ZrodlaArtykulow.txt", content);
    }
    static Integer getIdArtykulu(){
        return new Random().nextInt(Constants.liczbaArtykulow) + 1;
    }
    static Integer getIdZrodla(){
        return new Random().nextInt(Constants.liczbaZrodel) + 1;
    }
}
