public class Goscie {
    public static void main(String[] asdss){
        StringBuffer content = new StringBuffer();
        for (int i=0; i<Constants.liczbaGosci; i++){
            content = content.append(i + 1).append(';').append('\n') ;
        }
        new ZapisDoPliku("Goscie.txt", content.toString());
    }
}
