package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        FileReader fileReader=null;
        try{
            fileWriter = new FileWriter("Sample1.txt");
            fileWriter.write("I am in pune");
            System.out.println("File write successfully");
        }catch(IOException e){
            throw new RuntimeException(e);

        }finally {
            try{
                fileWriter.close();
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }
        try{
            fileReader = new FileReader("sample.txt");
            int i=fileReader.read();;
            while(i>0){
                System.out.println((char)i);
                i=fileReader.read();

            }

        }catch(IOException e){
            throw new RuntimeException(e);

        }
        

        }
    }

