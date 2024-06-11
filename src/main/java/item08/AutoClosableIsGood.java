package item08;

import java.io.BufferedInputStream;

public class AutoClosableIsGood implements AutoCloseable{
    private BufferedInputStream inputStream;

    @Override
    public void close() throws Exception {
        inputStream.close();
    }
}
