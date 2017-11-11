import java.util.Random;

public class Artykuly {
    static Integer idArtykulu;
    static String streszczenie, tresc;
    static Double cena;
    static Integer idWydania, idRedaktora, idStatusArtykulu;

    static Integer licznik = 0;
    static String content = new String();
    public static void main(String[] sdfsfsvs){
        for (int i=0; i<Constants.liczbaArtykulow; i++){
            content = content + (getIdArtykulu().toString() + ';' + getStreszczenie() + ';' + getTresc() + ';' + getCena().toString() + ';' + getIdWydania().toString()
                + ';' + getIdRedaktora().toString() + ';' + getIdStatusArtykulu().toString() + ';' + '\n');
        }
        new ZapisDoPliku("Artykuly.txt", content);
    }

    static Integer getIdArtykulu(){
        licznik++;
        return licznik;
    }
    static String getStreszczenie(){
        return "DUUUPAAAAAA";
    }
    static String getTresc(){
        return "00x006";
    }
    static Double getCena(){
        return Math.floor(new Random().nextDouble() * 100)/100.0;
    }
    static  Integer getIdWydania(){
        return new Random().nextInt(Constants.liczbaWydan) + 1;
    }
    static Integer getIdRedaktora(){
        return new Random().nextInt(Constants.liczbaRedaktorow);
    }
    static Integer getIdStatusArtykulu(){
        return new Random().nextInt(Constants.liczbaStatusArtykulu) + 1;
    }
}
