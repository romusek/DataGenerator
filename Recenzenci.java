import java.util.ArrayList;
import java.util.Random;

public class Recenzenci {

    static Integer licznik = 0;
    static String content = new String();

    static ArrayList<Integer> idCzytelnika = new ArrayList<>();
    public static void main(String[] sdf){
        for (int i=0; i<Constants.liczbaCzytelnikow; i++){
            idCzytelnika.add(i + 1);
        }

        for (int i=0; i<Constants.liczbaRecenzetow; i++){
            licznik++;
            content = content + licznik.toString() + ';' + getIdCzytelnika() + ';' + '\n';
        }
        new ZapisDoPliku("Recenzenci.txt", content);
    }


    static Integer getIdCzytelnika(){
        return idCzytelnika.remove(new Random().nextInt(idCzytelnika.size()));
    }
}
