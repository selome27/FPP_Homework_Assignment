package LESSON5.lesson5_problem3;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getPayment(){
        return baseSalary + (getGrossSales() * getCommissionRate());
    }

    @Override
    public String toString(){
        return " [Name: " + getFirstName() + " " + getLastName() + ", BaseSalary: " + baseSalary + ", GrossSalary: " + getGrossSales() + ", CommissionRate: " + getCommissionRate() + "]";
    }
}
