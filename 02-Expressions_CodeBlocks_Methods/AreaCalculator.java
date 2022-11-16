public class AreaCalculator {
    public static double area(double radius) {
        double pie = Math.PI;

        if (radius < 0) {
            return -1.0;
        }

        double area = (double) (pie * radius * radius);
        return area;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        double area = x * y;
        return area;
    }
}
