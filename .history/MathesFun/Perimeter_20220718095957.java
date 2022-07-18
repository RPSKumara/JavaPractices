
/**
 * Perimeter
 */
public class Perimeter {
    public String triangle(Float a , Float b , Float c) {
        float perimeter = a+b+c;
        String value = "Triangle Perimeter = " + perimeter;
        return value;
    }

    public String square(Float a) {
        float perimeter = a * 4;
        String value = "Square Perimeter = " + perimeter;
        return value;
    }

    public String rectangle(Float a , Float b) {
        float perimeter = a  4;
        String value = "Rectangle Perimeter = " + perimeter;
        return value;
    }
}