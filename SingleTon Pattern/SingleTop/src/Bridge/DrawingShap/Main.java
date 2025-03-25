package Bridge.DrawingShap;

public class Main {
    public static void main(String[] args) {
        // Create shapes with different implementations
        Shape windowsCircle = new Circle(5.0, 10, 20, new WindowsDrawingAPI());
        Shape linuxSquare = new Square(4.0, new LinuxDrawingAPI());
        Shape linuxCircle = new Circle(10.0,11,15,new LinuxDrawingAPI());

        // Draw shapes
        windowsCircle.draw(); // Uses Windows API
        linuxSquare.draw(); // Uses Linux API
        linuxCircle.draw(); //use Linux API
    }
}
