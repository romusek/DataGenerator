import java.util.Random;

public class ArtykulyAutorow {
    static Integer idAutora;
    static Integer idArtykulu;

    static Integer licznik = 0;
    static String content = new String();
    public static void main(String[] sdfsfsvs){
        for (int i=0; i<Constants.liczbaArtykulow; i++){
            content = content + (getIdAutora().toString() + ';' + getIdArtykulu().toString() + ';' + '\n');
        }
        new ZapisDoPliku("ArtykulyAutorow.txt", content);
    }
    static Integer getIdAutora(){
        return new Random().nextInt(Constants.liczbaAutorow) + 1;
    }
    static Integer getIdArtykulu(){
        licznik++;
        return licznik;
    }
}
