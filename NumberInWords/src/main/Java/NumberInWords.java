import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        StringBuilder str = new StringBuilder();

        if (n < 0) {
            System.out.println("Minus ");
            while (n < 0) {
                r = n % 10;
                n = n / 10;
                str.append(r);
            }
        } else if (n == 0) System.out.println("Zero");
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            str.append(r);

        }
        char c;
        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0' -> System.out.println("Zero");
                case '1' -> System.out.println("One");
                case '2' -> System.out.println("Two");
                case '3' -> System.out.println("Three");
                case '4' -> System.out.println("Four");
                case '5' -> System.out.println("Five");
                case '6' -> System.out.println("Six");
                case '7' -> System.out.println("Seven");
                case '8' -> System.out.println("Eight");
                case '9' -> System.out.println("Nine");
            }
        }
    }
}
// make it idiot-proof/tbd
// TDD/tbd

