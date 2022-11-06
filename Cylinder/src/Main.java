public class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;
        System.out.println("lidArea: " + c.lidArea());
        System.out.println("totalSurfaceArea: " + c.totalSurfaceArea());
        System.out.println("volume: " + c.volume());
    }
}