import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>tovar=new ArrayList<>();

        try{  Scanner tov=new Scanner(new File("D:\\newZacaz\\srlad.xlsx"));
        while (tov.hasNext()){
            tovar.add(tov.nextLine());
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
