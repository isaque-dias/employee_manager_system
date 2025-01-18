package filters;

import java.util.function.Predicate;

import entities.Employee;

// Classe usada para filtrar funcionários
public class FilterEmployee {
	
	 
	public Predicate<Employee> salaryAbove(Double salaryLimit){
		return employee -> employee.getSalary() >= salaryLimit;
	}
	
	public Predicate<Employee> experienceAbove(int yearsExperienceLimit){
		return employee -> employee.getYearsExperience() >= yearsExperienceLimit;
	}
}
