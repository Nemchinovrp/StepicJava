package stepic.nemchinovrp.two;

import java.util.List;
import java.util.function.IntPredicate;

public class Task2_12 {
    public static void main(String[] args) {
    }

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        if (predicates.size() == 0) {
            IntPredicate predicateResult = a -> false;
            return predicateResult;
        } else {
           return predicates.stream().reduce((x, y) -> x.or(y)).get();
        }
    }
}
