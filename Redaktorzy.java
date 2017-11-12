import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Redaktorzy {
    static ArrayList<String> imie = new ArrayList<String>();
    static ArrayList<String> nazwisko = new ArrayList<String>();
    static String tmp1, tmp2;
    static Scanner scanner;

    static Integer licznik = 0;
    static String content = new String();

    static ArrayList<Integer> idCzytelnika = new ArrayList<>();
    public static void main(String[] sdf){
        for (int i=0; i<Constants.liczbaCzytelnikow; i++){
            idCzytelnika.add(i + 1);
        }

        try{
            scanner = new Scanner(new File("imiona.txt"));
            while(scanner.hasNext()){
                imie.add(scanner.next());
            }
            scanner = new Scanner(new File("nazwiska.txt"));
            while(scanner.hasNext())
                nazwisko.add(scanner.next());
        }catch (Exception e){
            System.out.println("nie ma pliku");
        }
        for (int i=0; i<Constants.liczbaRedaktorow; i++){
            licznik++;
            tmp1 = getImie();
            tmp2 = getNazwisko();
            content = content + licznik.toString() + ';' +tmp1 + ';' + tmp2 + ';' + genEmail(tmp1, tmp2) + ';' +
                    getIdCzytelnika() + '\n';
        }
        new ZapisDoPliku("Redaktorzy.csv", content);
    }

    static String getImie(){
        Random r = new Random();
        //imie.size();
        int liczba = r.nextInt(imie.size());
        return imie.get(liczba);
    }
    static String getNazwisko(){
        Random r = new Random();
        int liczba = r.nextInt(nazwisko.size());
        return nazwisko.get(liczba);
    }
    static String genEmail(String im,String naz){
        return im + '.' + naz + "@wp.com";
    }
    static Integer getIdCzytelnika(){
        return idCzytelnika.remove(new Random().nextInt(idCzytelnika.size()));
    }
}
