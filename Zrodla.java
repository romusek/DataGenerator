import java.util.Random;

public class Zrodla {
    public static void main(String[]asd){
        Integer licznik = 0;
        String content = new String();
        for (int i=0; i<Constants.liczbaZrodel; i++){
            licznik++;
            content = content + licznik.toString() + ';' + getAutor() + ';' + getTytul() + ';' + getRokWydania().toString()
                    + ';' + getMiejsceWydania() + ';' + getNazwaCzasopisma() + ';' + getDate() + ';' + getTytulRozdzialu()
                    + ';' + getLink() + ';' + getDate() + ';' + getIdTypu().toString() + ';' + '\n';
        }
        new ZapisDoPliku("Zrodla.txt", content);
    }
    static String getAutor(){
        return "maskraaletododupydziala";
    }
    static String getTytul(){
        return "OLUDZIETOJESZCZEGORZEJ";
    }
    static Integer getRokWydania(){
        return new Random().nextInt(100) + 1901;
    }
    static String getMiejsceWydania(){
        return "Wroclaw";
    }
    static String getNazwaCzasopisma(){
        return "PlayBoy";
    }
    /*static String getDate(){
        String dzien = new Integer(new Random().nextInt(28) + 1).toString();
        String miesiac = new Integer(new Random().nextInt(12) + 1).toString();
        String rok = new Integer(new Random().nextInt(100) + 1901).toString();
        return new String(dzien + '/' + miesiac + '/' + rok);
    }*/
    static String getDate(){
        Integer dzien = new Integer(new Random().nextInt(28) + 1);
        Integer miesiac = new Integer(new Random().nextInt(12) + 1);
        String rok = new Integer(new Random().nextInt(100) + 1901).toString();
        return new String(rok + (miesiac<10 ? "0" + miesiac.toString():miesiac.toString()) + (dzien<10 ? "0" +
                dzien.toString():dzien.toString()));//RRRRMMDD
    }
    static String getTytulRozdzialu(){
        return "Pozycje";
    }
    static String getLink(){
        return "pornhub.com";
    }
    static Integer getIdTypu(){
        return new Random().nextInt(Constants.liczbaTypuZrodla);
    }
}
