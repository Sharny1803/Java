public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z){
        if ((x < 10) || (x > 1000) || (y < 10) || (y > 1000)|| (z < 10) || (z > 1000)){
            return false;
        }

        int xLastDigit = x % 10;
        int yLastDigit = y % 10;
        int zLastDigit = z % 10;

        return (xLastDigit == yLastDigit) || (xLastDigit == zLastDigit) || (yLastDigit == zLastDigit);
    }
    public static boolean isValid (int number){
        return ((number >= 10) && (number <= 1000));
    }
}
