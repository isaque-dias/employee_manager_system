package application;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.EmployeeManager;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		EmployeeManager employeeManager = new EmployeeManager();

		while (true) {
			try {
				StringBuilder str = new StringBuilder();
				str.append("\nMenu Principal");
				str.append("\n-------------------------");
				str.append("\n1 - Cadastrar Funcionário");
				str.append("\n2 - Mostrar Funcionários");
				str.append("\n3 - Fechar Sistema");
				System.out.println(str);

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

					LocalDate hiringDate = LocalDate.now();

					Employee employee = new Employee(name, address, email, phoneNumber, age, function, salary,
							hiringDate);
					employeeManager.addEmployee(employee);

					System.out.print("\nFuncionário adicionado!");
					break;

				case 2:
					employeeManager.sortByName();
					
					if(employeeManager.getEmployees().isEmpty()) {
						System.out.print("\nNenhum funcionário cadastrado!");
					}
					else {
						for(Employee e : employeeManager.getEmployees()) {
							System.out.println(e);
						}
					}
					break;
					
				case 3: 
					System.out.print("\nSistema Finalizado!");
					System.exit(0);
					break;

				default:
					System.out.print("\nOpção inválida. Tente novamente!\n");
					break;
				}

			} 
			catch (InputMismatchException e) {
				System.out.println("\nNão é um valor válido!");
				sc.nextLine();
			}
		} 
	}
}
