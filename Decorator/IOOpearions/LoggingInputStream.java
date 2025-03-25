package Decorator.IOOpearions;

import java.io.IOException;
import java.io.InputStream;

public class LoggingInputStream extends InputStream {
    private InputStream ips;
    private int countChar = 0;
    private int countWord = 0;
    private int countLine = 0;
    private boolean isWord = false;

    public LoggingInputStream(InputStream ips) {
        this.ips = ips;
    }

    @Override
    public int read() throws IOException {
        int bdata = ips.read();

        if (bdata != -1) {
            char ch = (char) bdata;
            countChar++;

            if (bdata == '\n') {
                countLine++;
            }

            if (Character.isWhitespace(ch)) {
                isWord = false;
            } else if (!isWord) {
                countWord++;
                isWord = true;
            }
        }

        return bdata;
    }

    public void display() {
        System.out.println("Total Characters: " + countChar);
        System.out.println("Total Words: " + countWord);
        System.out.println("Total Lines: " + (countLine + 1));
    }

    @Override
    public void close() throws IOException {
        ips.close();
    }
}