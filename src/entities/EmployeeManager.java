package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManager {
	private List<Employee> employees;

	public EmployeeManager() {
		this.employees = new ArrayList<Employee>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	// Adicionar funcionário na lista
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	// Ordenar funcionários por ordem de nome
	public void sortByName() {
		Collections.sort(employees, new NameComparator());
	}
}
