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

    public String rectangle(double w, double h) {
        // w = width , h = height
        double area = w * h;
        String value = "Area of Rectangle = " + String.format("%.2f", area);
        return value;
    }

    public String parallelogram(double b, double h) {
        // b = base , h = vertical height
        double area = b * h;
        String value = "Area of Parallelogram = " + String.format("%.2f", area);
        return value;
    }

    public String trapezoid(double a, double b, double h) {
        double area = (1/2 * (a+b)) * h;
        String value = "Area of Trapezoid = " + String.format("%.2f", area);
        return value;
    }

    public String circle(double r) {
        double area = 2 * 3.14 * r * r;
        String value = "Area of Circle = " + String.format("%.2f", area);
        return value;
    }

    public String sector(double r, double a) {
        double area = ((2 * 3.14 * r) * (a / 360)) + (2 * r);
        // double area = (2 * 22 / 7 * r * a / 360) + (2 * r);
        String value = "Area of Sector = " + String.format("%.2f", area);
        return value;
    }
}
