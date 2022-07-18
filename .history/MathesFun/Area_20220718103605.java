public class Area {
    public String triangle(double b, double h) {
        double area = (1/2) * b * h;
        String value = "Perimeter of Triangle = " + String.format("%.2f", area);
        return value;
    }
}
