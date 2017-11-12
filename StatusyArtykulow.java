public class StatusyArtykulow {
    public static void main(String[]s){
        Integer licznik = 0;
        String content = new String();
        String statusyArtykulow[] = new String[Constants.liczbaStatusArtykulu];
        statusyArtykulow[0] = "zgłoszony do recenzji";
        statusyArtykulow[1] = "odrzucony";
        statusyArtykulow[2] = "oczekujący na recenzję";
        statusyArtykulow[3] = "zrecenzowany";
        statusyArtykulow[4] = "gotowy do wydania";
        statusyArtykulow[5] = "do poprawki";
        statusyArtykulow[6] = "wydany";
        for (int i=0; i<Constants.liczbaStatusArtykulu; i++){
            licznik++;
            content = content + licznik.toString() + ';' + statusyArtykulow[i] + '\n';
        }
        new ZapisDoPliku("StatusyArtykulow.csv", content);
    }
}
