package Project2;

public class Circle implements Shape {
    private double radius = 2.5;
    double area;
    double perimeter;

    public void calculateArea() {
        area = radius * radius * Math.PI;

        System.out.println(" Area of the Circle " + area);
    }

    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        System.out.println(" Perimeter of the Circle " + perimeter);
    }
}

class Square implements Shape {
    private double side=4;
    private double area;
    private double perimeter;

    public void calculateArea() {
        area = side * side;
        System.out.println(" Area of the Square " + area);

    }

    public void calculatePerimeter() {
        perimeter = 4 * side;
        System.out.println(" Perimeter of the Square " + perimeter);

    }
}

class Tester {
    public static void main(String[] args) {

        Shape[] arr = {new Circle(), new Square()};
        for (Shape a : arr) {
            a.calculateArea();
            a.calculatePerimeter();
        }
    }
}
