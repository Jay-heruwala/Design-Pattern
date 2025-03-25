package Decorator.IOOpearions;

import java.io.IOException;
import java.io.OutputStream;

public class LoggingOutputStream extends OutputStream {
    private OutputStream ops;
    private int countBytes = 0;

    public LoggingOutputStream(OutputStream ops) {
        this.ops = ops;
    }

    @Override
    public void write(int b) throws IOException {
        countBytes++;
        ops.write(b);
    }

    public void display() {
        System.out.println("Total Bytes Write: " + countBytes);
    }

    @Override
    public void close() throws IOException {
        ops.close();
    }
}