package Bridge.DrawingShap;

public class Circle extends Shape {
    private double radius;
    private int x, y;

    public Circle(double radius, int x, int y, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawingAPI.drawCircle(radius, x, y);
    }
}
