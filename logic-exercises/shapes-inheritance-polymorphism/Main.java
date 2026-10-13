import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(3));

        double totalArea = 0;

        for(Shape GeometricForm : shapes) {
            totalArea += GeometricForm.calculateArea();
        }

        System.out.println(totalArea);
    }
}
