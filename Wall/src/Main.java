public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(3, 5);
        System.out.println("area = " + wall.getArea());
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
        Wall nextWall = new Wall();
        nextWall.setWidth(-1.25);
        nextWall.setHeight(-1.25);
        System.out.println(nextWall.getArea());
    }
}