package Inheritance;
import java.util.Scanner;
public class ClientE {
    public static void main (String[] arg) {
        Scanner input = new Scanner (System.in);
        String last, first, dept;
        double pay_rate;
        int hours;
        Employee prof = new Employee("John", "Doe", 25.20, 50, "COSC");
        //Employee newEmp = new Employee();

        System.out.print("Please enter employee last name ");
        last = input.next();
        System.out.print("Please enter employee first name ");
        first = input.next();
        System.out.print("Please enter department ");
        dept = input.next();
        System.out.print("Please enter employee pay rate ");
        pay_rate = input.nextDouble();
        System.out.print("Please enter employee hours worked ");
        hours = input.nextInt();
        System.out.println("Record for both employees with overridden .toString from subclass");
        System.out.println("Output with calls to overridden method print from subclass");
        System.out.println("Output with calls to getters from the superclass ");
        System.out.println("Call to overridden equals/subclass for 2 Employee objects");
       
        Employee actor =  new Employee();
        Employee newEmp = new Employee(first, last, pay_rate, hours, dept);

        
        System.out.print(newEmp);
        System.out.print(prof);
        prof.print();
        newEmp.print();

        System.out.print("The wages for" + newEmp.lastName() + " " + newEmp.firstName() + " " + newEmp.getDepartment() + ("Department is $") + newEmp.calculatePay());
        
        if (prof.equals((Object) newEmp)) {
            System.out.println("prof and newEmp are equal");
        }
        else {
            System.out.println("prof and newEmp are not equal");
        }
        Employee newEmp1 = newEmp.getCopy();
        
        if (newEmp.equals((Object)newEmp1)) {
            System.out.println("newEmp and newEmp1 are equal");
        }
        else {
            System.out.println("newEmp and newEmp1 are not equal");
        }  
    }
}
