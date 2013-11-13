package de.epages.WebServices;

import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

    /**
     * reads a binary file
     * @param fileName file name
     * @return binary file content
     */
    public static byte[] readFileFromClasspath(String fileName) throws IOException
    {
        InputStream in = FileUtil.class.getClassLoader().getResourceAsStream(fileName);
        byte[] data = new byte[in.available()];
        in.read(data, 0, in.available());
        in.close();
        
        return data;
    }

}
