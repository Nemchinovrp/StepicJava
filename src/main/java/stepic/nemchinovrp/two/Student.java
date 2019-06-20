package stepic.nemchinovrp.two;

public class Student {
    private String name;
    private int csGrade;

    public Student() {
    }

    public Student(String name, int csGrade) {
        this.name = name;
        this.csGrade = csGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCsGrade() {
        return csGrade;
    }

    public void setCsGrade(int csGrade) {
        this.csGrade = csGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", csGrade=" + csGrade +
                '}';
    }
}
