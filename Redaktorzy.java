import java.util.ArrayList;
import java.util.Random;

public class Redaktorzy {
    static ArrayList<String> imie = new ArrayList<String>();
    static ArrayList<String> nazwisko = new ArrayList<String>();

    static Integer licznik = 0;
    static String content = new String();

    static ArrayList<Integer> idCzytelnika = new ArrayList<>();
    public static void main(String[] sdf){
        for (int i=0; i<Constants.liczbaCzytelnikow; i++){
            idCzytelnika.add(i + 1);
        }
        
        for (int i=0; i<Constants.liczbaRedaktorow; i++){
            licznik++;
            content = content + licznik.toString()  + ';' + getIdCzytelnika() + ';' + '\n';
        }
        new ZapisDoPliku("Redaktorzy.txt", content);
    }
    
    static Integer getIdCzytelnika(){
        return idCzytelnika.remove(new Random().nextInt(idCzytelnika.size()));
    }
}
