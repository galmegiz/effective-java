package item09;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamCorruptedException;

public class TopLine {
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        // 예외가 두개 다 발생하지만 두 번째 예외만 발생한다.
        // try with resource 코드를 사용할 경우 예외를 모두 볼 수 있다.
        double a = 1.0;
        double b = 1.0;
        Double.compare(a, b);
        try{
            return br.readLine();
        }finally {
            br.close();
        }

    }

    static class BadBufferedReader extends BufferedReader {

        public BadBufferedReader(Reader in, int sz) {
            super(in, sz);
        }

        @Override
        public String readLine() throws IOException {
            throw new CharConversionException();
        }

        @Override
        public void close() throws IOException {
            throw new StreamCorruptedException();
        }
    }

}
