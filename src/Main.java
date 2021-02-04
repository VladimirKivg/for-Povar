import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//muu();
//        ArreyFile file = new ArreyFile();
//        for (String s:file.arrayList()){

//            System.out.println(s);//
//        }


//            System.out.println(s);
//        }
        MouseEventDemo demo = new MouseEventDemo();
        demo.setSize(new Dimension(300,300));
        demo.setTitle("MouseEventDemo якась хуйня трапилась");

        demo.setVisible(true);

    }

    private static void muu() {
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
