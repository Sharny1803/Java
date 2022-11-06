public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(-1.25);
        calculator.setSecondNumber(-1.25);
        System.out.println("Addition result: " + calculator.getAdditionResult());
        System.out.println("Subtraction result: " + calculator.getSubtractionResult());
        System.out.println("Multiplication result: " + calculator.getMultiplicationResult());
        System.out.println("Division result: " + calculator.getDivisionResult());
    }
}