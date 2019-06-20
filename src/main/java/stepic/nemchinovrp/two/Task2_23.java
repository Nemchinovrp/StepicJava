package stepic.nemchinovrp.two;

import java.util.List;

public class Task2_23 {
    public static void main(String[] args) {

    }

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(d -> d.getCode().startsWith("111-"))
                .flatMap(department -> department.getEmployees().stream())
                .filter(e -> e.getSalary() >= threshold)
                .count();
    }
}
