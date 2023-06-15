package homework12;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("Дмитрий", 3, 4.5);
        Student s2 = new Student("Дмитрий", 3, 4.3);
        compareStudents(s1, s2);
        compareStudentsByNestedIf(s1, s2);
    }

    static void compareStudents(Student s1, Student s2) {
        if (s1.name.equals(s2.name)
                && s1.course == s2.course
                && s1.grade == s2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты разные");
        }
    }

    static void compareStudentsByNestedIf(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Студенты одинаковые");
                } else {
                    System.out.println("У студентов разный средний балл");
                }
            } else {
                System.out.println("Студенты на разных курсах");
            }
        } else {
            System.out.println("У студентов разные имена");
        }
    }
}
