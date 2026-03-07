 //Print All employees
        List<Employee> allemployees = employees.stream().collect(Collectors.toList());
        //System.out.println(allemployees);
        
        //Extract Employee Names
        List<String> employeeNames= employees.stream().map(Employee::getName).toList();
        //System.out.println(employeeNames);
        
        //Extract Employee Salaries
        List<Double> salaries = employees.stream().map(Employee::getSalary).collect(Collectors.toList());
        
        
        //Filter Employee Salary greater than 70000
        List<Employee> employeeSalary = employees.stream().filter(e->e.getSalary()>70000).collect(Collectors.toList());
        
        //Filter Employee Names Salary greater than 70000
        List<String> employeeName= employees.stream().filter(e->e.getSalary()>90000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(employeeName);
        
        //Filter Employees from IT department
        List<Employee> ITemployees = employees.stream().filter(e->e.getDepartment().equals("IT")).collect(Collectors.toList());
        System.out.println(ITemployees);
        
        //Total Employee Count 
       long countEmployee= employees.stream().count();
       
       //HR Employee count
      long HrCount =  employees.stream().filter(e->e.getDepartment().equals("HR")).count();
      
