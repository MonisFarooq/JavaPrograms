package employee;

public class ContractEmployee implements SalaryCalculator {

    private String empName;
    private int empId;
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String empName, int empId,
                            int hoursWorked, double hourlyRate) {

        this.empName = empName;
        this.empId = empId;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void displaySalary() {

        System.out.println("\n----- Contract Employee -----");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: Rs " + hourlyRate);
        System.out.println("Salary: Rs " + calculateSalary());
    }
}