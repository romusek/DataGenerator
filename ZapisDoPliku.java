import java.io.File;
import java.io.PrintWriter;

public class ZapisDoPliku {
    public ZapisDoPliku(String path, String content){
        File file = new File("C:\\***\\generator\\target\\" + path);//SET YOUR PATH
        try{
            PrintWriter pw = new PrintWriter(file);
            pw.write(content);
        }catch (Exception e){
            System.out.println("wyjebalo sie");
        }
    }
}
