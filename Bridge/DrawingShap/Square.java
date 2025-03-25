package Bridge.DrawingShap;

public class Square extends Shape {
    private double side;

    public Square(double side, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.side = side;
    }

    @Override
    void draw() {
        drawingAPI.drawSquare(side);
    }
}
