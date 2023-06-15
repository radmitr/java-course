package homework7;

import homework5.Employee;

public class AccessModifierTest {

    public static void main(String[] args) {
        homework5.Employee employee = new Employee(3, "Фигулин", 20, 100.0, "Logistic");
        System.out.print(employee.surname);
        System.out.print(" зарабатывает ");
        employee.showSalary();
//        System.out.println(employee.salary);
    }
}
