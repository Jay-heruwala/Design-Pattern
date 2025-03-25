package Decorator.IOOpearions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Write the Data OutPutStream
            String msg = "Om Namah Shivay";
            OutputStream os = new FileOutputStream("Test.txt");
            LoggingOutputStream lo = new LoggingOutputStream(os);
            lo.write(msg.getBytes());
            lo.display();
            lo.close();

            // Read the Data InputStream
            InputStream is = new FileInputStream("Test.txt");
            LoggingInputStream li = new LoggingInputStream(is);

            while (li.read() != -1)
                ;
            li.display();
            li.close();
        } catch (IOException ie) {
            System.err.println(ie.getMessage());
        }
    }
}