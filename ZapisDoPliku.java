import java.io.File;
import java.io.PrintWriter;

public class ZapisDoPliku {
    public ZapisDoPliku(String path, String content){
        File file = new File(path);
        try{
            PrintWriter pw = new PrintWriter(file);
            pw.write(content);
            pw.close();
        }catch (Exception e){
            System.out.println("wyjebalo sie");
        }
    }
}
