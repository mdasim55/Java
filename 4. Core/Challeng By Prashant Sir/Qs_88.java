/* 
88. File not found Exception Handling.
    Write a program to read filename from the user and display its content. The program should handle the situation
    where the file does not exits.
    Key point:-
    . Use Scanner to read the filename from the user.
    . Use fileReader to read the file content.
    . Implement a try-catch block to handle fileNotFoundException.
    . Dispaly a message informing the user if teh file is not found.
*/

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Qs_88 {
    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        String fileName=input.nextLine();
        try(FileReader reader=new FileReader(fileName)) {
            int read;
            while((read=reader.read()) != -1) {
                System.out.print((char)read);
            }
        } catch(FileNotFoundException e) {
            System.out.println("Exception is: "+e.getMessage());
            System.out.println("Sorry, File is not founded.");
        } catch(IOException e) {
            System.out.println("An error occured while reading the file.");
            e.printStackTrace();
        } finally {
            input.close();
        }
    }
}
