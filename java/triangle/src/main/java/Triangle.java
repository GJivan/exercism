import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

class Triangle {

    List<Double> triangle;

    Triangle(double side1, double side2, double side3) throws TriangleException {

        triangle = Optional.of(asList(side1, side2, side3))
                .filter( legalTriangle )
                .orElseThrow(() -> new TriangleException());
    }

    boolean isEquilateral() {
        return triangle.stream().distinct().count() == 1;

    }

    boolean isIsosceles() {
        return triangle.stream().distinct().count() < 3;

    }

    boolean isScalene() {
        return triangle.stream().distinct().count() == 3;
    }

    private static Predicate<List<Double>> legalTriangle = l -> {
        double sum = l.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        return l.stream()
                .allMatch(side ->
                        (sum - side > side) && (side > 0));
    };

}
