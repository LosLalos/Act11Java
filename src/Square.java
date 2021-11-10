public class Square implements Shape{

    // Square attributes.
    private double length;

    // Square constructor;
    public Square(double length) {
        this.length = length;
    }

    // Returns the area of the square.
    @Override
    public double getArea() {
        return length * length;
    }

    // Returns the perimeter of the square.
    @Override
    public double getPerimeter() {
        return length * 4;
    }
}
