package StreamsInterviewCoding;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
	
		List<Employee> employees = List.of(
			
			        new Employee("Jaya", "IT", 50000),
			        new Employee("Surya", "IT", 65000),
			        new Employee("Kumar", "HR", 45000),
			        new Employee("Anu", "HR", 55000),
			        new Employee("Ravi", "Finance", 70000),
			        new Employee("Priya", "Finance", 74800),
			        new Employee("Vijay", "IT", 75000),
			        new Employee("Karthik", "HR", 60000)
			);
		
		//maximum salary employee
	    Employee maxSalaryEmployee =
	            employees.stream()
	                     .max(Comparator.comparing(Employee::getSalary))
	                     .orElse(null);
	    	 
	    System.out.println("1stmax = "+maxSalaryEmployee);
	    
	  //second maximum salary employee
	    Employee secondMaxSalaryEmployee =
	            employees.stream()
	                     .sorted(Comparator.comparing(Employee::getSalary).reversed())
	                     .skip(1)
	                     .findFirst()
	                     .orElse(null);
	    
	    System.out.println("Sec max ="+secondMaxSalaryEmployee);
		
		//maximum salary employee in each department
		
		Map<String, Optional<Employee>> maxSalaryByDept =
		        employees.stream()
		        .collect(Collectors.groupingBy(Employee::getDept,
		                    Collectors.maxBy(Comparator.comparing(Employee::getSalary))
		            ));
		System.out.println("maxSalaryByDept = "+maxSalaryByDept);//use (minBy) for minimum salary
		
		//second maximum salary in each department
	 	Map<String, Employee> secondMaxEmployeeByDept =
	 	     employees.stream()
	 	          .collect(Collectors.groupingBy(Employee::getDept,
	 	                 Collectors.collectingAndThen(Collectors.toList(),
	 	                      c -> c.stream()
	 	                            .sorted(Comparator.comparing(Employee::getSalary).reversed())
	 	                            .skip(1)   // skip max employee
	 	                            .findFirst()
	 	                            .orElse(null)
	 	                        )
	 	                ));
	 	//for only print salary alone
	 	//secondMaxEmployeeByDept.values().forEach(e -> System.out.println(e.getSalary()));

	 		System.out.println("secondMaxSalaryByDept= "+secondMaxEmployeeByDept);
		
		//Average Salary in Each Department
		Map<String, Double> avgSalaryAllDept =
		        employees.stream()
		                 .collect(Collectors.groupingBy(Employee::getDept,
		                         Collectors.averagingDouble(Employee::getSalary)
		                         ));
		System.out.println("avgSalaryAllDept ="+avgSalaryAllDept);
		
		//Department with Highest Average Salary
		Map.Entry<String, Double> highestAvgDept =
	            employees.stream()
	                .collect(Collectors.groupingBy(Employee::getDept,
	                        Collectors.averagingDouble(Employee::getSalary)
	                ))
	                .entrySet()
	                .stream()
	                .max(Map.Entry.comparingByValue())
	                .orElse(null);
	                
		
		System.out.println("highestAvgDept= "+highestAvgDept);

	    
	    //department with highest total salary
	    Map.Entry<String, Double> highestTotalSalaryDept =
	 	        employees.stream()
	 	                .collect(Collectors.groupingBy(Employee::getDept,
	 	                          Collectors.summingDouble(Employee::getSalary)
	 	                ))
	 	                .entrySet()
	 	                .stream()
	 	                .max(Map.Entry.comparingByValue())
	 	                .orElse(null);
	    
	    System.out.println("highestTotalSalaryDept ="+highestTotalSalaryDept);
	    
	    
	    //Top 3 salaried employees overall
	    List<Employee> top3Employees =
	            employees.stream()
	                     .sorted(Comparator.comparing(Employee::getSalary).reversed())
	                     .limit(3)
	                     .toList();
	    
	    System.out.println("top 3="+top3Employees);
	    
	    //top 3 salary in each department
	    Map<String, List<Employee>> top3ByDept =
	          employees.stream()
	                   .collect(Collectors.groupingBy(
	                            Employee::getDept,                                  // group by department
	                            Collectors.collectingAndThen(
	                                    Collectors.toList(),                        // list of employees in that dept
	                                    c -> c.stream()
	                                            .sorted(Comparator.comparing(Employee::getSalary)
	                                                              .reversed())      // sort salaries desc
	                                            .limit(3)                           // top 3
	                                            .toList()
	                            )
	                    ));
	    System.out.println("top3ByDept = "+top3ByDept);
	    	
	 	
	 		
	 		//10 percent salary hike to each employee
	 		List<Employee> hike = employees.stream()
	 		        .map(e -> {
	 		        	
	 		            e.setSalary(e.getSalary() + (e.getSalary() * 10 / 100));
	 		            return e;
	 		            
	 		        		}).toList();
	 		        


		 	System.out.println("hike ="+hike);
		 	
		 	//employee with longest name
		 	Employee maxlengthName=employees.stream()
					.max(Comparator.comparing(e->e.getName().length()))
					.orElse(null);
			System.out.println(maxlengthName);
			
			//Highest-paid employee in IT department
			Employee maxIT =
			        employees.stream()
			                 .filter(e -> e.getDept().equals("IT"))
			                 .max(Comparator.comparing(Employee::getSalary))
			                 .orElse(null);
			
			//Employee names in sorted order
			List<String> sortedNames =
			        employees.stream()
			                 .map(Employee::getName)
			                 .sorted()
			                 .toList();
			System.out.println(sortedNames);

			
			//Total salary of all employees
			double total =
			        employees.stream()
			                 .mapToDouble(Employee::getSalary)
			                 .sum();
			System.out.println(total);

			
	 		
	 		
	 	////////////////////////////////////////////////////////


			//Might not exist → Optional
			//findFirst()findAny()max()min()maxBy()minBy()reduce()-->For these, .orElse(...) is needed.
			//
			//✔ Always exists → no Optional
			//counting()summingDouble()averagingDouble()joining()toList()toSet()-->orElse not needed
	    
	    

	}
}

