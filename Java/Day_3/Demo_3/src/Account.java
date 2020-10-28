public class Account {
    public void SalarySlip(String name, double salary, int absenties) throws AbsentiesException{
        if(absenties>10){
            throw new AbsentiesException();
        }
        double tax,netSalary;
        tax= salary*0.25;
        netSalary = salary-tax;
        System.out.println(name+", your salary is "+salary);
        System.out.println(name+", your tax is "+tax);
        System.out.println(name+", your net salary is " + netSalary);
    }
}