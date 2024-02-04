package filehand;
import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File myFile=new File("filedatabase.txt");
        try {
            if(myFile.createNewFile()){
                System.out.println("File is created");
            }
            else {
                System.out.println("file created error");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
