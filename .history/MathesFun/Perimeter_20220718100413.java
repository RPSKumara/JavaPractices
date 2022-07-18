
/**
 * Perimeter
 */
public class Perimeter {
    public String triangle(double a , double b , double c) {
        double perimeter = a+b+c;
        String value = "Triangle Perimeter of = " + perimeter;
        return value;
    }

    public String square(double d) {
        double perimeter = d * 4;
        String value = "Square Perimeter = " + perimeter;
        return value;
    }

    public String rectangle(double a , double b) {
        double perimeter = 2*(a +b);
        String value = "Rectangle Perimeter = " + perimeter;
        return value;
    }
}