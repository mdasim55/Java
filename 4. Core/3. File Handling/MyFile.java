import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) {
        /* 
        // Code to create a new file...
        File myFile=new File("MyFile2.txt");
        try {
            myFile.createNewFile();
        } catch(IOException e) {
            System.out.println("Unable to create this file.");
            System.out.println(e);
            e.printStackTrace();
        }

        // Code to write to a file......
        try {
            FileWriter obj = new FileWriter("MyFile2.txt");
            obj.write("This is my first file on the java course.\nOkey now bye bye.");
            obj.close();
        } catch(IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
        // Code to reading a file.
        File myfile=new File("MyFile2.txt");
        try {
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine()) {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        // code to deleting a file....
        File myFile=new File("MyFile2.txt");
        if(myFile.delete()) {
            System.out.println("I have deleted successfully: "+myFile.getName());
        } else {
            System.out.println("Some problem occured while deleting the file.");
        }
    }
}