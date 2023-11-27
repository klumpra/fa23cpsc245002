import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 * This is our data access object (DAO) class.
 * It's a model class because it deals with acquiring the data we eventually store
 */
public class ShapeReader {
    public static ArrayList<Shape> readFromFile(String fileName) {
        try {
            ArrayList<Shape> shapes = new ArrayList<Shape>();
            Scanner fsc = new Scanner(new File(fileName));
            String line;
            String[] parts;
            String shapeType;
            double x, y, radius, length, width;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();
                parts = line.split("\t");
                shapeType = parts[0];
                x = Double.parseDouble(parts[1]);
                y = Double.parseDouble(parts[2]);
                if (shapeType.equalsIgnoreCase("circle")) {
                    radius = Double.parseDouble(parts[3]);
                    shapes.add(new Circle(x,y,radius));
                } else if (shapeType.equalsIgnoreCase("rectangle")) {
                    length = Double.parseDouble(parts[3]);
                    width = Double.parseDouble(parts[4]);
                    shapes.add(new Rectangle(x,y,length,width));
                }
            }
            fsc.close();
            return shapes;
        } catch (Exception ex) {
    //        ex.printStackTrace();
            return null;   // couldn't actually return a valid ArrayList
        }
    }
}
