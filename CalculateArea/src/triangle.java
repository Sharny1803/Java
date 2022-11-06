import java.util.Scanner;

public class triangle {
    public static void main (String [] args){
        System.out.println("Enter the 3 sides of a triangle ");
        Scanner sc = new Scanner(System.in);
        float a,b,c,s;
        double area;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        s = (a + b + c) / 2f;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area is: " + area);
        System.out.println("S is: " + s);
    }
}
