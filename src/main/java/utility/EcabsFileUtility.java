package utility;

import java.io.InputStream;

public class EcabsFileUtility {

    public InputStream getFileFromResources(String fileName) throws IllegalArgumentException{

        ClassLoader classLoader = getClass().getClassLoader();

        InputStream resource = classLoader.getResourceAsStream(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return resource;
        }

    }
}
