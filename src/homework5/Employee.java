package homework5;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    Employee(int id, String surname, int age) {
        this(id, surname, age, 0.0, null);
    }

    private Employee(int id) {
        this.id = id;
    }

    void doubleSalary() {
        salary *= 2;
    }

    public void showID() {
        System.out.println(id);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showSalary() {
        System.out.println(salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee taras = new Employee(1, "Тарас", 35, 100, "HR");
        taras.doubleSalary();
        System.out.print("Новая зарплата работника " + taras.surname + " :");
        taras.showSalary();

        Employee elena = new Employee(2, "Елена", 33, 120, "IT");
        elena.doubleSalary();
        System.out.println("Новая зарплата работника " + elena.surname + " :");
        elena.showSalary();
    }
}
