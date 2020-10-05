package Employee;

import java.util.Scanner;

import java.util.Scanner;
public class Employee {
    protected float rate=300.0f;
}
class daily_emp extends Employee {
}
class monthly_emp extends Employee {
}
class SupSubClassTest {
    public static void main(String[] args) {
        float r;
        Employee emp1 = new Employee();
        System.out.println("\"Employee\"\nRate per Day=" +emp1.rate+"BAHT");
        Scanner scan = new Scanner(System.in);
        System.out.print("\"Daily Employee\"\nEnter Rate = ");
        r = scan.nextFloat();
        daily_emp emp2 = new daily_emp();
        emp2.rate = r;
        System.out.println("Rate per Day = " + emp2.rate + " BAHT");
        System.out.print("\"Monthly Employee\"\nEnter Salary : ");
        r = scan.nextFloat();
        monthly_emp emp3 = new monthly_emp();
        emp3.rate = r;
        System.out.println("Rate per Day = " + emp3.rate/30 +" BAHT");
    }
}
