import java.util.Random;

public class Kategorie {
    public static void main(String[]sdffsfdv){
        Integer licznik = 0;
        String content = new String();
        for (int i=0; i<Constants.liczbaKategorii + 1; i++){
            licznik++;
            content = content + licznik + ';' + "Matematyka" + "\n";
        }
        new ZapisDoPliku("Kategorie.csv", content);
    }
    static Integer getIdKategorii() {
        return new Random().nextInt(Constants.liczbaKategorii) + 1;
    }
}
