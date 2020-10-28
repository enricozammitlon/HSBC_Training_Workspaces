public class App {
    public static void main(String[] args) throws Exception {
        Account salesDepartment = new Account();
        Account itDepartment = new Account();
        try{
            salesDepartment.SalarySlip("Sales Rico",1000,12);
        }
        catch(AbsentiesException e){
            System.out.println("You have taken too many days off!");
        }
        try{
            itDepartment.SalarySlip("IT Rico",5000,12);
        }
        catch(AbsentiesException e){
            System.out.println("We're cool!");
        }
        /*
        catch(OverdraftException e){
            System.out.println("You're in overdraft!");
        }
        */
    }
}
