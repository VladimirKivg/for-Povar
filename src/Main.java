import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tovar = new ArrayList<>();
        Scanner tov = null;
        String sss = null;

        try {
            tov = new Scanner(new File("srlad.csv" ));
            while (tov.hasNext()) {
                sss = tov.nextLine();
                tovar.add(sss);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String i : tovar) {
            System.out.println(i);
        }
    }
}
