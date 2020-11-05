public class App {
    public static void main(String[] args) throws Exception {
        HSBc hsbc = new HSBc();
        Banking(hsbc);

        Barclays barclays = new Barclays();
        Banking(barclays);
    }
    static public void Banking(BankOfEngland bankingRef){
        bankingRef.showBalance();
        bankingRef.openAccount();
    }
}
