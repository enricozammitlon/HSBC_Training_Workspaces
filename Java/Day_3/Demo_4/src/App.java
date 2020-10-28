public class App {
    public static void main(String[] args) throws Exception {
        String num1,num2;
        double result;

        num1 = "100";
        num2 = "a";
        try {
            result = (double) Integer.parseInt(num1)/Integer.parseInt(num2);
            System.out.println("Result is "+result);
        } catch (NumberFormatException e) {
            System.err.println("Only digits can be used in arithmetic op");
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by 0");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
