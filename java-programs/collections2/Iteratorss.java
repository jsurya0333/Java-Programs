package collections2;
import java.util.Iterator;
import java.util.HashMap;

public class Iteratorss {

	public static void main(String[] args) {
		HashMap<Integer, Employee> emp = new HashMap<>();
		emp.put(1, new Employee("Surya", true));
        emp.put(2, new Employee("Priya", false));
        emp.put(3, new Employee("Jaya", true));
        
		Iterator<Employee> empl = emp.values().iterator();

		while(empl.hasNext()) {
		    if(empl.next().isGender() == true) {
		        empl.remove();
		    }
		}
		System.out.println(emp);
		}
	}
class Employee {
    private String name;
    private boolean gender; // true = male, false = female (example)

    public Employee(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + "]";
	}
}
