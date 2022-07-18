public class Area {
    public String triangle(double b, double h) {
        double area = (1/2) * b * h;
        String value = "Area of Triangle = " + String.format("%.2f", area);
        return value;
    }

    public String square(double a) {
        double area = Math.pow(a, 2);
        String value = "Area of Square = " + String.format("%.2f", area);
        return value;
    }
}
