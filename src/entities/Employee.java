package entities;

import java.time.LocalDate;

public class Employee extends Person {
	private String function;
	private Double salary;
	private Integer yearsExperience;
	private LocalDate hiringDate; // Data de Contratação

	public Employee(String name, String address, String email, String phoneNumber, Integer age, String function,
			Double salary, Integer yearsExperience, LocalDate hiringDate) {
		super(name, address, email, phoneNumber, age);
		this.function = function;
		this.salary = salary;
		this.yearsExperience = yearsExperience;
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

	public Integer getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(Integer yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	public LocalDate getHiringDate() {
		return hiringDate;
	}

	@Override
	public String toString() {
		return "\n[Employee]" 
				+ "\nName: "
				+ getName()
				+ "\nAddress: "
				+ getAddress() 
				+ "\nEmail: " 
				+ getEmail() 
				+ "\nPhone Number: " 
				+ getPhoneNumber()
				+ "\nAge: "
				+ getAge()
				+ "\nFunction: "
				+ getFunction()
				+ "\nSalary: "
				+ String.format("R$ %.2f", getSalary())
				+ "\nYears of experience: "
				+ getYearsExperience()
				+ "\nHiring Date: "
				+ getHiringDate();
	}

	
}
