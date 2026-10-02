package com.example.employee_sample;

import java.util.*;


class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department + " | " + salary;
    }
}

class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    // TODO: reject if null, salary <= 0, or ID already exists in the list
    public boolean addEmployee(Employee e) {

        if(e == null || e.getSalary() <= 0) return false;

        if(employees.stream().map(Employee::getId).anyMatch(id->id==e.getId())) return false;

        return employees.add(e);

    }

    // TODO: loop or stream over the list; return match or null
    public Employee findById(int id) {
        return employees.stream().filter(e->e.getId()==id).findFirst().orElse(null);

    }

    // TODO: try removeIf; true if something was removed
    public boolean removeById(int id) {

        return employees.removeIf(e -> e.getId() == id);

    }

    // TODO: max by salary, or null if the list is empty
    public Employee getHighestPaid() {
        return employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);

    }

    // TODO: print all, or "No employees" if the list is empty
    public void displayAll() {

        if(employees.isEmpty()) {
            System.out.println("NO Employees, Please Check once!!!");
            return;
        }

        employees.stream().forEach(e-> System.out.println(e.toString()));
    }
}

public class EmployeeStreamQ {
    public static void main(String[] args) {
        EmployeeManager m = new EmployeeManager();

        System.out.println(m.addEmployee(new Employee(1, "Ravi", "IT", 50000))); // true
        System.out.println(m.addEmployee(new Employee(1, "Sam", "HR", 40000)));  // false (duplicate)
        System.out.println(m.addEmployee(new Employee(2, "Anu", "HR", 0)));      // false (salary)
        System.out.println(m.addEmployee(new Employee(3, "Kim", "IT", 70000)));  // true

        System.out.println(m.findById(1));      // Ravi
        System.out.println(m.findById(99));     // null
        System.out.println(m.getHighestPaid()); // Kim
        m.displayAll();

        System.out.println(m.removeById(1));    // true
        System.out.println(m.removeById(99));   // false
        m.displayAll();
    }
}