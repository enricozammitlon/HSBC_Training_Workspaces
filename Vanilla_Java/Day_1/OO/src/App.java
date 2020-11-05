public class App {
    public static void main(String[] args) throws Exception {
        First ref;
        ref = new First();
        ref.A = 89;
        ref.B = 100;
        ref.C = ref.A + ref.B;
        System.out.println("Results is "+ref.C);
    }
}
