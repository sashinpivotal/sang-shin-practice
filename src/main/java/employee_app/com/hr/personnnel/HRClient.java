package employee_app.com.hr.personnnel;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {

        // Create two instances of SalariedEmployee objects
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Tracey",
                LocalDate.of(2020, 01, 30),
                1000.0);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Tom",
                LocalDate.of(2010, 02, 20),
                2000.0);

        Department department = new Department("marketing", "boston");
        department.addEmployee(salariedEmployee1);
        department.addEmployee(salariedEmployee2);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Joe",
                LocalDate.of(1990, 3, 10),
                10,
                10.0);
        department.addEmployee(hourlyEmployee1);

        int numberOfEmployeesWhoWorked
                = department.letEmployeesWorkAndGetNumberOfEmployeesWhoWorked();
        System.out.println(numberOfEmployeesWhoWorked);

        double departmentTotalMonthlyCompensation
                = department.computeDepartmentTotalMonthlyCompensation();
        System.out.println(departmentTotalMonthlyCompensation);

    }
}
