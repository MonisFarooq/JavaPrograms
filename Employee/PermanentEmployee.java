package employee;

public class PermanentEmployee implements SalaryCalculator {

    private String empName;
    private int empId;
    private double basicPay;

    public PermanentEmployee(String empName, int empId, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.basicPay = basicPay;
    }

    @Override
    public double calculateSalary() {
        double hra = basicPay * 0.20;
        double da = basicPay * 0.10;

        return basicPay + hra + da;
    }

    public void displaySalary() {
        System.out.println("\n----- Permanent Employee -----");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: Rs " + basicPay);
        System.out.println("Gross Salary: Rs " + calculateSalary());
    }
}