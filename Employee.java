package Inheritance;

public class Employee extends Person{
    private double payRate;
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;
    //default constructor
    public Employee() {
        super();
        payRate = 0;
        hoursWorked = 0;
        department = " "; 
    }
    //alternate constructor
    public Employee(String first, String last, double rate, double hours, String dept) {
        super(first, last);
        payRate = rate;
        hoursWorked = hours;
        department = dept;
    }
    public String toString() {
        return(" " + payRate + " " + hoursWorked + " " + department);
    }
    public void print() {
        System.out.print(payRate + " " + hoursWorked + " " + department);
    }
    public double calculatePay() {
        return (hoursWorked <= HOURS) ? hoursWorked * payRate : HOURS * payRate + (hoursWorked - HOURS) * OVERTIME * payRate;
    }
    public void setALL(String first, String last, double rate, double hours, String dep) {

    }
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public String getDepartment() {
        return department;
    }
    public boolean equals (Object obj) {
        Employee employee2 = getEmployee(obj);
        if (employee2 == null) {
        }
        return false;
    }
    public Employee getCopy() {
        Employee employee = new Employee();
        return new Employee(super.firstName(), super.lastName(), payRate, hoursWorked, department);
    }
    public void copy(Employee e) {
        e.payRate = payRate;
        e.hoursWorked = hoursWorked;
        e.department = department;
    }
    public Employee getEmployee(Object obj) {
        return (obj == null || ! (obj instanceof Employee)) ? null: (Employee) obj;
    }
}
