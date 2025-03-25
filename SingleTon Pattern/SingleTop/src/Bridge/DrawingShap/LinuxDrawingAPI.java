package Bridge.DrawingShap;

public class LinuxDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double radius, int x, int y) {
        System.out.println("Drawing circle on Linux: radius=" + radius + ", x=" + x + ", y=" + y);
    }

    @Override
    public void drawSquare(double side) {
        System.out.println("Drawing square on Linux: side=" + side);
    }
}
