
//Group Employees by Department
Map<String,List<Employee>> empByDept = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));

//groupingBy(classifier)    
//groupingBy(classifier, downstream)
//groupingBy(classifier, mapFactory, downstream)

//Count Employees Per Department
Map<String,Long> empCountByDept = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

//Average Salary Per Department
Map<String,Double> empAvgByDept = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
Map<String,Long> empAvgByDept = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averaginLong(Employee::getSalary)));

//Highest Salary Employee Per Department
Map<String,Optional<Employee>> empHighestByDept = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

//Partition Employees Salary > 70000
Map<Boolean,List<Employee>> partitionEmployee = emp.stream().collect(Collectors.partitioningBy(e->e.getSalary()>7000));

