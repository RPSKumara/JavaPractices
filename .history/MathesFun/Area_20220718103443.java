public class Area {
    public String triangle(double a, double b, double c) {
        double perimeter = a + b + c;
        String value = "Perimeter of Triangle = " + String.format("%.2f", perimeter);
        return value;
    }
}
