public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //    How to find the distance between two points?
//    To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
//    d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//    Where √ represents square root.
    public double distance() {
        return Math.sqrt((0.0 - this.x) * (0.0 - this.x) + (0.0 - this.y) * (0.0 - this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) - (y - this.x) + (x - this.y) * (y - this.y));
    }

    public double distance(Point another) {
        return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
    }
}
