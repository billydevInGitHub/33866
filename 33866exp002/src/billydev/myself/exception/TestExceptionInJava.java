package billydev.myself.exception;

import java.io.File;
import java.io.IOException;

public class TestExceptionInJava {
    public static void main(String[] args) throws IOException {

        File file = new File("/test.text");
        file.createNewFile();
    }
}
