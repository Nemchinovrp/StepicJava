package stepic.nemchinovrp.two;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class Task2_13 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Elizabet", 97)
        ,new Student("Francis", 85),new Student("Alisa", 100)
        ,new Student("Antonio", 85),new Student("John", 100)
        ,new Student("Vladimir", 94),new Student("Mary", 82));

        students.sort(
                comparing(Student::getCsGrade, reverseOrder())
                        .thenComparing(Student::getName));
        students.forEach(System.out::println);
    }
}
