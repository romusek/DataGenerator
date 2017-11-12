public class TypyPraw {
    public static void main(String[]as){
        Integer licznik = 0;
        String content = new String();
        for (int i=0; i<Constants.liczbaTypuPrawa; i++){
            licznik++;
            content = content + licznik.toString() + ';' + "pupencjal" + ';' + '\n';
        }
        new ZapisDoPliku("TypyPraw.txt", content);
    }
}
