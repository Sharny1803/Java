import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type values for a, b and c ");

        Scanner sc = new Scanner(System.in);

        int a,b,c;
        double r1,r2;


        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        double sqrt = Math.sqrt(b * b - 4 * a * c);

        r1 = (-b + sqrt) / (2 * a);
        r2 = (-b - sqrt) / (2 * a);

        System.out.println("Roots are: " + "\n" + "r1 = " + r1 + "\n" + "r2 = " + r2) ;
    }
}