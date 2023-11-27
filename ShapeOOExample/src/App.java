import java.util.ArrayList;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5,3,7));
        shapes.add(new Circle(1,2,3));
        shapes.add(new Rectangle(5,6,7,3));
        shapes.add(new Rectangle(1,1,8,10));
        System.out.println("As initially created: ");
        ShapeWriter.printToScreen(shapes);
        System.out.println("\nSorted naturally by distance from origin:");
        Collections.sort(shapes);
        ShapeWriter.printToScreen(shapes);
        System.out.println("\nSorted by area:");
        Collections.sort(shapes,new CompareShapesByArea());
        ShapeWriter.printToScreen(shapes);
        System.out.println("\nSorted by perimeter:");
        Collections.sort(shapes,new CompareShapesByPerim());
        ShapeWriter.printToScreen(shapes);
        System.out.println("\nNow writing to a file: ");
        if (ShapeWriter.printToFile(shapes,"c:\\temp\\shapes.txt")) {
            System.out.println("Success!");
        } else {
            System.out.println("We could not write the shapes to a file.");
        }
        System.out.println("\nNow these were read from the file: ");
        ArrayList<Shape> readFromFile = ShapeReader.readFromFile("c:\\temp\\shapes.txt");
        if (readFromFile == null) {
            System.out.println("No shapes were read.");
        } else {
            ShapeWriter.printToScreen(readFromFile);
        }
    }
}
