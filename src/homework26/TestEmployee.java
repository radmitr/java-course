package homework26;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {

    public void printEmployee(Employee e) {
        System.out.println("Имя : " + e.name + '\n' + "Отдел : " + e.department + '\n' + "Зарплата : " + e.salary);
    }

    public void employeeFilter(ArrayList<Employee> employees, Predicate<Employee> predicate) {
        for (Employee e : employees) {
            if (predicate.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Тарас", "Строительство", 150));
        employees.add(new Employee("Елена", "Финансы", 320));
        employees.add(new Employee("Александр", "IT", 250));
        employees.add(new Employee("Алексей", "IT", 190));
        employees.add(new Employee("HR", "HR", 256));

        TestEmployee testEmployee = new TestEmployee();
        testEmployee.employeeFilter(employees, e -> "IT".equals(e.department) && e.salary > 200);
        System.out.println("------------------------------------------------------------------");
        testEmployee.employeeFilter(employees, e -> e.name.startsWith("Е") && e.salary != 450);
        System.out.println("------------------------------------------------------------------");
        testEmployee.employeeFilter(employees, (Employee e) -> {return e.name.equals(e.department);});
    }
}
