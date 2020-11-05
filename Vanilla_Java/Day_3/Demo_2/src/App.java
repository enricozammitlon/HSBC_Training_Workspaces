public class App {
    public static void main(String[] args) throws Exception {
        try {
            int a = 1/0;
        } catch (ArithmeticException e) {
            System.out.println("Div by 0");
        }
        System.out.println("No div by 0");
    }
}
