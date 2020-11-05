public class Main {
    public static void main(String args[]){
        Account HSBC, Natwest;
        HSBC = new Account();
        Natwest = new Account();
        HSBC.setConversion(1);
        HSBC.convert(100);
        Natwest.setConversion(2);
        HSBC.convert(100);
    }
}
