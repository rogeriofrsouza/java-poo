package entities;

// Deve implementar a interface Comparable para ser ordenável pelo método sort()
public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// Definir como o objeto é comparado com outro recebido por parâmetro
	@Override
	public int compareTo(Employee other) {
//		return salary.compareTo(other.getSalary());
//		return -salary.compareTo(other.getSalary());
		
		return name.compareTo(other.getName());
	}

	@Override
	public String toString() {
		return getName() + ", $" + String.format("%.2f", getSalary());
	}
	
}
