package ObjectCreation.TryWithResources;

import java.io.*;

public class FileInput {
    static void copyTryFinally(String source, String destination) throws IOException {
        InputStream is = new FileInputStream(source);

        try {
            OutputStream os = new FileOutputStream(destination);

            try {
                int in = is.read();
                os.write(in);
            } finally {
                os.close();
            }
        } finally {
            is.close();
        }
    }

    static void copyTryWithResources(String source, String destination) throws  IOException { //much more clean, easier to diagnose
        try (InputStream is = new FileInputStream(source);
            OutputStream os = new FileOutputStream(destination)) {
            int in = is.read();
            os.write(in);
        }
    }
}
