public class Main {
    public static void main(String[] args) {
        Point pointOne = new Point();
        Point pointTwo = new Point(5,3);
        pointOne.setX(3);
        pointOne.setY(5);
        System.out.println(pointOne.distance());
        System.out.println(pointOne.distance(10,5));
        System.out.println(pointOne.distance(pointTwo));
    }
}