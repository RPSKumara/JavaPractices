
/**
 * Perimeter
 */
public class Perimeter {
    public String triangle(double a , double b , double c) {
        double perimeter = a+b+c;
        String value = "Perimeter of Triangle = " + perimeter;
        return value;
    }

    public String square(double d) {
        double perimeter = d * 4;
        String value = "Perimeter of Square = " + perimeter;
        return value;
    }

    public String rectangle(double a , double b) {
        double perimeter = (a+b) *2;
        String value = "Perimeter of Rectangle = " + perimeter;
        return value;
    }
}