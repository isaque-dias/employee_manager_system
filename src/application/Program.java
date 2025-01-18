package application;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.EmployeeManager;
import filters.FilterEmployee;

public class Program {

	public static void mainMenu() {
		StringBuilder str = new StringBuilder();
		str.append("\nMenu Principal");
		str.append("\n-------------------------");
		str.append("\n1 - Cadastrar Funcionário");
		str.append("\n2 - Mostrar Funcionários");
		str.append("\n3 - Filtrar Funcionários");
		str.append("\n4 - Fechar Sistema");
		System.out.println(str);
	}

	public static void filterMenu() {
		StringBuilder str = new StringBuilder();
		str.append("\nFilter Menu");
		str.append("\n-----------------------------------");
		str.append("\n1 - Filtrar por Salário");
		str.append("\n2 - Filtrar por anos de experiência");
		str.append("\n3 - Voltar ao Menu Principal");
		System.out.println(str);
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		EmployeeManager employeeManager = new EmployeeManager();

		while (true) {
			try {
				mainMenu();

				System.out.print("\nEscolha uma opção: ");
				Integer choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.print("\nNome: ");
					String name = sc.nextLine();

					System.out.print("Endereço: ");
					String address = sc.nextLine();

					System.out.print("Email: ");
					String email = sc.nextLine();

					System.out.print("Phone Number: ");
					String phoneNumber = sc.nextLine();

					System.out.print("Age: ");
					Integer age = sc.nextInt();
					sc.nextLine();

					System.out.print("Function: ");
					String function = sc.nextLine();

					System.out.print("Salary: ");
					Double salary = sc.nextDouble();

					System.out.print("Years of experience: ");
					Integer yearsExperience = sc.nextInt();
					sc.nextLine();

					LocalDate hiringDate = LocalDate.now();

					Employee employee = new Employee(name, address, email, phoneNumber, age, function, salary,
							yearsExperience, hiringDate);

					employeeManager.addEmployee(employee);

					System.out.print("\nFuncionário adicionado!");
					break;

				case 2:
					employeeManager.sortByName();

					if (employeeManager.getEmployees().isEmpty()) {
						System.out.print("\nNenhum funcionário cadastrado!");
					} else {
						for (Employee e : employeeManager.getEmployees()) {
							System.out.println(e);
						}
					}
					break;

				case 3:
					filterMenu();
					System.out.print("\nEscolha uma opção: ");
					Integer choiceFilter = sc.nextInt();
					sc.nextLine();

					if (choiceFilter == 1) {
						System.out.print("\nInforme o salário: ");
						Double salaryLimit = sc.nextDouble();

						employeeManager.getEmployees().stream().filter(new FilterEmployee().salaryAbove(salaryLimit))
								.forEach(System.out::println);

					}
					else if (choiceFilter == 2) {
						System.out.print("\nInforme os anos de experiência: ");
						yearsExperience = sc.nextInt();
						sc.nextLine();

						// Filtrando a lista de funcionários por anos de experiência
						employeeManager.getEmployees().stream()
								.filter(new FilterEmployee().experienceAbove(yearsExperience))
								.forEach(System.out::println);

					} 
					else if (choiceFilter == 3) {
						System.out.println("\nVoltando ao menu principal...");
					}
					else {
				        System.out.println("\nOpção inválida. Tente novamente!");
				    }
					break;

				case 4:
					System.out.print("\nSistema Finalizado!");
					System.exit(0);
					break;

				default:
					System.out.print("\nOpção inválida. Tente novamente!\n");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("\nNão é um valor válido!");
				sc.nextLine();
			}
		}
	}
}
