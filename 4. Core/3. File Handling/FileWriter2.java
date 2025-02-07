import java.io.FileWriter;
import java.io.IOException;

public class FileWriter2 {
    public static void main(String[] args) {
        String fileName="Java-Course.txt";
        try(FileWriter writer=new FileWriter(fileName);) {               // Try with resource Syntax.
            writer.write("May be, thisb is best java course.");
            for(int i=0;i<1000;i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("The file is written successfully.");
            // writer.close();
        } catch(IOException e) {
            System.out.printf("Exception Occured: %s",e.getMessage());
        }
    }
}
