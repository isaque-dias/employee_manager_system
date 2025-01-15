package entities;

import java.time.LocalDate;

public class Employee extends Person {
	private String function;
	private Double salary;
	private LocalDate hiringDate; // Data de Contratação
	
	
	public Employee(String name, String address, String email, String phoneNumber, Integer age, String function,
			Double salary, LocalDate hiringDate) {
		super(name, address, email, phoneNumber, age);
		this.function = function;
		this.salary = salary;
		this.hiringDate = hiringDate;
	}
	

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getHiringDate() {
		return hiringDate;
	}


	@Override
	public String toString() {
		return "\nNome: " 
				+ getName() 
				+ "\nEndereço: " 
				+ getAddress() 
				+ "\nEmail: " 
				+ getEmail()
				+ "\nNúmero de Telefone: " 
				+ getPhoneNumber() 
				+ "\nIdade: " 
				+ getAge() 
				+ "\nFunção: "
				+ getFunction()
				+ "\nSalário: "
				+ String.format("R$ %.2f", getSalary())
				+ "\nData de Contratação: "
				+ getHiringDate();
	}
}
