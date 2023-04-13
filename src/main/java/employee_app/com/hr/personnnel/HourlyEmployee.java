package employee_app.com.hr.personnnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private int numberOfHoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name,
                          LocalDate hireDate,
                          int numberOfHoursWorkedPerMonth,
                          double hourlyRate) {
        super(name, hireDate);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorkedPerMonth = numberOfHoursWorkedPerMonth;
    }

    @Override
    public double computeMonthlyCompensation() {
        return hourlyRate * numberOfHoursWorkedPerMonth;
    }
}
