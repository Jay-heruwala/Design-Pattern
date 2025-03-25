package Bridge.DrawingShap;

public class WindowsDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double radius, int x, int y) {
        System.out.println("Drawing circle on Windows: radius=" + radius + ", x=" + x + ", y=" + y);
    }

    @Override
    public void drawSquare(double side) {
        System.out.println("Drawing square on Windows: side=" + side);
    }
}
