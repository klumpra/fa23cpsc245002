import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * This is our view class.
 * It helps represent shapes on the screen and in a text file
 */
public class ShapeWriter {
    public static void printToScreen(ArrayList<Shape> shapes) {
        for (Shape s : shapes) {
            System.out.println(s.toStringDetailed());
        }
    }
    public static boolean printToFile(ArrayList<Shape> shapes, String fileName) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fileName))));
            for (Shape s : shapes) {
                pw.println(s);
            }
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
