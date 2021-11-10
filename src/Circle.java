public class Circle implements Shape{

    // Circle attributes.
    private double radius;

    // Circle constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Returns the area of the circle.
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Returns the perimeter of the circle.
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
