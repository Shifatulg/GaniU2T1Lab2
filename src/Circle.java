public class Circle {
    private double radius;
    public Circle(double CircleRadius) {
        radius = CircleRadius;
    }
    public void area() {
        System.out.print(Math.PI * radius * radius);
    }
}
