
public class Cylinder {
    private int radius;
    private int height;

    public Cylinder(){
        height=radius=1;
    }

    public Cylinder(int r,int h){
        radius = r;
        height = h;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setDimensions(int r,int h){
        radius = r;
        height = h;
    }
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}
