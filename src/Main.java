import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>tovar=new ArrayList<>();

        try{  Scanner tov=new Scanner(new File("srlad.xlsx"));

            while (tov.hasNextBoolean()){
              tov.nextLine();
            tovar.add(tov.nextLine());
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String i:tovar ) {
            System.out.println(i);
        }
    }
}
