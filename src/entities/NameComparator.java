package entities;

import java.util.Comparator;

// Classe para verificar se os nomes são iguais
public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
