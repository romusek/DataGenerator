public class StatusyRecenzji {
    public static void main(String[]s){
        Integer licznik = 0;
        String content = new String();
        String statusyRecenzji[] = new String[Constants.liczbaStatusRecenzji];
        statusyRecenzji[0] = "inne1";
        statusyRecenzji[1] = "inne2";
        statusyRecenzji[2] = "inne3";
        statusyRecenzji[3] = "inne4";
        statusyRecenzji[4] = "inne5";
        statusyRecenzji[5] = "inne6";
        statusyRecenzji[6] = "inne7";
        for (int i=0; i<Constants.liczbaStatusRecenzji; i++){
            licznik++;
            content = content + licznik.toString() + ';' + statusyRecenzji[i] + '\n';
        }
        new ZapisDoPliku("StatusyRecenzji.csv", content);
    }
}
