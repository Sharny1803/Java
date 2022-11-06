import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify height:");
        int Height = scanner.nextInt();
        System.out.println("Specify radius:");
        int Radius = scanner.nextInt();

        c.setHeight(Height);
        c.setRadius(Radius);

        System.out.println("Dimensions: ");
        System.out.println("Height: " + c.getHeight());
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Lid area: " + c.lidArea());
        System.out.println("Circumference: " + c.perimeter());
        System.out.println("totalSurfaceArea: " + c.drumArea());
        System.out.println("Volume " + c.volume());

    }
}
