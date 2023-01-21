package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        File file= new File("C:\\java\\JavaAtCodekul\\untitled\\src\\filehandling\\sample.txt");
        try(FileOutputStream obj=new FileOutputStream(file)) {
            String str="welcome";
            obj.write(str.getBytes());


        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
