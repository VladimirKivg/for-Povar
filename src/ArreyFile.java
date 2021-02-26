import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArreyFile {//переробити під звичайний сканер, його принамі розумію
    public  ArrayList<String> arrayList (){
        List<String> result =new ArrayList<>();
      try {
        result= Files.readAllLines(Paths.get("srlad.csv"));
      } catch (IOException e) {
          e.printStackTrace();
      }
        return (ArrayList) result;
    }
}
