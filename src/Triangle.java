public class Triangle implements Shape{

    // Triangle attributes.
    private double base, height, length_1, length_2, length_3;

    // Area constructor.
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Perimeter constructor.
    public Triangle(double length_1, double length_2, double length_3) {
        this.length_1 = length_1;
        this.length_2 = length_2;
        this.length_3 = length_3;
    }

    // Returns the area of the triangle.
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    // Returns the perimeter of the triangle.
    @Override
    public double getPerimeter() {
        return length_1 + length_2 + length_3;
    }
}
