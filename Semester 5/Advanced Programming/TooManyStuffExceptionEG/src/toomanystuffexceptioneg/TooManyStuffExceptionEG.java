package toomanystuffexceptioneg;

import java.io.IOException;

public class TooManyStuffExceptionEG {
    public static void main(String[] args) throws TooManyStuffException {
        try {
            simulateIOException();
        } catch (IOException e) {
            throw new TooManyStuffException(e.getMessage());
        }
    }

    public static void simulateIOException() throws IOException {
        throw new IOException("test");
    }
}
