public class SlowaKluczowe {
    public static void main(String[]asd){
        Integer licznik = 0;
        String content = new String();
        for (int i=0; i<Constants.liczbaSlowKluczowych; i++){
            licznik++;
            content = content + licznik.toString() + ';' + "KOCHAMYBAZYDANYCH" + ';' + '\n';
        }
        new ZapisDoPliku("SlowaKluczowe.txt", content);
    }
}
