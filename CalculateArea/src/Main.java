import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Base and Height ");
        Scanner sc = new Scanner(System.in);
        float base,height,area;
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = (base * height) / 2;
        System.out.println("Area is: " + area);
    }
}