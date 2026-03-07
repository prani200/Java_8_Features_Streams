//In Java 8 Streams, sorted(), max(), and min() are important operations used for ordering and finding extreme values in a stream.
sorted() → Intermediate operation --->  returns new sorted stream Also sorted(Comparator.comparing())
max() → Terminal operation -----> returns optional
min() → Terminal operation -----> returns optional
Intermidate Operations ALWAYS Returns NEW STREAM


   //Highest Salaried Employee (Sorted)
     Employee emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().orElse(null);
     System.out.println(emp.toString());
     
     //Highest salaried Employee(max)
     String maxEmp = employees.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getName).orElse(null);
     System.out.println(maxEmp.toString());
      
     //Lowest salaried Employee(min) --- Observe the Return types
     Optional<Employee> emp2 = employees.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
     Employee emp2 = employees.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
     String minEmp = employees.stream().min(Comparator.comparing(Employee::getSalary)).map(Employee::getName).orElse(null);
     System.out.println(emp2.toString());
        
    //Average Salary
    double avgSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    
    //Total Salaray
    double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
    
    //Total Salary using reduce
    double totalDoubleSum = employees.stream().mapToDouble(Employee::getSalary).reduce(0,Double::sum);
    
    //Sort Employee by salary Ascending Order
    List<Employee> ascendingEmployee = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
    
    //Sort Employee by salary Descending Order
    
    List<Employee> descendingEmployees = employees.stream().sorted(Comparator.comparing(Employee:;getSalary).reversed()).collect(Collectors.toList());
    
    //Distinct departments
   List<String> distinctDepartments =  employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        
        
  

