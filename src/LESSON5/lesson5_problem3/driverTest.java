package LESSON5.lesson5_problem3;

import java.sql.ResultSet;
import java.util.Arrays;

public class driverTest {
    public static Employee[] findSalaryList (Employee[] col, double salary) {
        if (col == null || col.length == 0)
            return new Employee[0];
        int count = 0;
        for (Employee e : col) {
            if(e!=null && e.getPayment() < salary)
                count++;
        }
        Employee[] temp = new Employee[count];
        int index = 0;
        for(Employee e:col){
            if(e.getPayment() < salary){
                temp[index++] = e;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new HourlyEmployee("Peter","George","022-23-6695",2000,30);
        emp[1] = new CommissionEmployee("John","Carlos","036-01-1452",3000,500);
        emp[2] = new SalariedEmployee("Maria","Antonio","125-45-6789",2500);
        emp[3] = new BasePlusCommissionEmployee("Tom","Tonny", "022-33-3265",5000,400,3000);
        emp[4] = new SalariedEmployee("Ava","Smith","044-15-9633",2500);

        for(Employee e: emp){
            System.out.print(e.getClass().getSimpleName());
            System.out.println(e);
        }
        System.out.println("*****************************************************************");
        System.out.println("Employee whose salary < 3000 are: ");
        System.out.println(Arrays.toString(findSalaryList(emp,3000)));
    }
}
