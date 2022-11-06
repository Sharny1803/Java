public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if (number < 0){
            number *= -1;
        }

        int reverse = 0;
        int mainNumber = number;

        while (mainNumber > 0){
            reverse = reverse * 10 + mainNumber % 10;
            mainNumber /= 10;
        } return reverse == number;
    }
}
