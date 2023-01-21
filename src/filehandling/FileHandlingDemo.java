package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file = new File("C:\\java\\JavaAtCodekul\\untitled\\src\\filehandling\\sample.txt");
        try {
            FileOutputStream obj = new FileOutputStream(file);
            String str = "welcome";
            byte arr[] = str.getBytes();
            obj.write(arr);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while(i>=0){
                System.out.print((char)i);
                i = fileInputStream.read();
            }
            System.out.println(i);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
