package stepic.nemchinovrp.two;

public class Main {
    public static void main(String[] args) {
        TernaryIntPredicate ternaryIntPredicate = (x, y, z) -> x != y && y != z && x != z;
        System.out.println(ternaryIntPredicate.check(1,1,1));
        System.out.println(ternaryIntPredicate.check(1,2,3));
    }
}
