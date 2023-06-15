package homework21;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setGrade(int grade) {
        if (grade >=1 && grade <=10) {
            this.grade = grade;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Course : " + getCourse());
        System.out.println("Grade : " + getGrade());
    }
}

class TestStudent{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Андрей"));
        student.setCourse(2);
        student.setGrade(9);
        student.showInfo();
    }
}
