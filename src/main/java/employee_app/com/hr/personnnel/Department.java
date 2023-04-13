package employee_app.com.hr.personnnel;

import java.time.LocalDate;

public class Department {

    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int nextAvailableSlotOfEmployeeArray = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
        employees[nextAvailableSlotOfEmployeeArray++] = employee;
    }

    public int letEmployeesWorkAndGetNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = 0;

        for (int i = 0; i < nextAvailableSlotOfEmployeeArray; i++) {
            if (employees[i].work().contains("worked")) {
                numberOfEmployeesWhoWorked++;
            }
        }

        return numberOfEmployeesWhoWorked;
    }

    public double computeDepartmentTotalMonthlyCompensation() {
        double monthlyTotalCompensation = 0.0;

        for (int i = 0; i < nextAvailableSlotOfEmployeeArray; i++) {
            double monthlyCompensation
                    = employees[i].computeMonthlyCompensation();
            monthlyTotalCompensation += monthlyCompensation;
        }

        return monthlyTotalCompensation;
    }


}

