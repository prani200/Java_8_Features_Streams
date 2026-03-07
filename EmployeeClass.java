class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    public Employee(int id, String name, int age, String department, double salary) {}
    this.id = id;
    this.name = name;
    this.age age;
    this.department = department;
    this.salary = salary;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public String toString() {
        return id + " " + name + " " + age + " " + department + " " + salary;
    }
}

public class Main {
    public static void main(String[] args) {

        List < Employee > employees = Arrays.asList(
            new Employee(1, "Surya", 25, "IT", 60000), new Employee(2, "Mahesh", 30, "HR", 50000), new Employee(3, "Kiran", 28, "IT", 75000), new Employee(4, "Anil", 35, "Finance", 90000), new Employee(5, "Suresh", 40, "IT", 120000), new Employee(6, "Ravi", 22, "HR", 40000), new Employee(7, "John", 29, "Finance", 85000), new Employee(8, "Sam", 31, "IT", 95000)
        );


    }
}
