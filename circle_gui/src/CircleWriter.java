import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CircleWriter {
    public static boolean writeToFile(File f, ArrayList<Circle> circles) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            for (Circle c : circles) {
                pw.println(c);
            }
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
