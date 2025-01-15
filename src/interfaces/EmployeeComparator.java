package interfaces;

// Interface para comparar nomes e ordenar
public interface EmployeeComparator<T> {
	int compare(T o1, T o2);
}
