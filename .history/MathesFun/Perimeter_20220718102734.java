
/**
 * Perimeter
 */
public class Perimeter {
    public String triangle(double a, double b, double c) {
        double perimeter = a + b + c;
        String value = "Perimeter of Triangle = " + String.format("%.2f", perimeter);
        return value;
    }

    public String square(double d) {
        double perimeter = d * 4;
        String value = "Perimeter of Square = " + String.format("%.2f", perimeter);
        return value;
    }

    public String rectangle(double a, double b) {
        double perimeter = (a + b) * 2;
        String value = "Perimeter of Rectangle = " + String.format("%.2f", perimeter);
        return value;
    }

    public String Quadrilateral(double a, double b, double c, double d) {
        double perimeter = a + b + c + d;
        String value = "Perimeter of Quadrilateral = " + String.format("%.2f", perimeter);
        return value;
    }

    public String circle(double r) {
        double perimeter = 2 * 3.14 * r;
        String value = "Perimeter of Circle = " + String.format("%.2f", perimeter);
        return value;
    }

    public String sector(double r, double a) {
        // double perimeter = ((2 * 3.14 * r) * (a / 360)) + (2 * r);
        double perimeter = ((2 * (7 / 22) * r) * (a / 360)) + (2 * r);
        String value = "Perimeter of Sector = " + String.format("%.2f", perimeter);
        return value;
    }
}