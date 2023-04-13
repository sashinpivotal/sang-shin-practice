package employee_app.com.hr.personnnel;

import java.time.LocalDate;

public abstract class Employee {

    private String name;
    private LocalDate hireDate;

    public Employee() {
    }

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getEmployeeInfo() {
        String employeeInfo
                = "name = " + name
                + ", hireDate = " + hireDate;
        return employeeInfo;
    }

    public String work() {
        return name + " worked.";
    }

    public abstract double computeMonthlyCompensation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
