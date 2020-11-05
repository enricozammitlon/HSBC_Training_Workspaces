class Account {
    static int conversion=1;
    public void convert(int amount) {
        int convertedAmount = amount * conversion;
        System.out.println("Amount: "+ convertedAmount);
    }
    public void setConversion(int D){
        conversion = D;
    }
}