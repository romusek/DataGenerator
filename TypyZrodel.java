public class TypyZrodel {
    public static void main(String[]as){
        Integer licznik = 0;
        String content = new String();
        for (int i=0; i<Constants.liczbaTypuZrodla; i++){
            licznik++;
            content = content + licznik.toString() + ';' + "mazurowiesanajlepsinaswiecie" + '\n';
        }
        new ZapisDoPliku("TypyZrodel.csv", content);
    }
}
