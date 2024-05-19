package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author : RajivNayan
 * @Version : 0.1
 */
public class FileMainClass {
    public static void execute() throws IOException {
        File newFile = new File("DemoFile.txt");
//        to create file
//        newFile.createNewFile();

        // to write in file
        FileWriter writer = new FileWriter(newFile);
        writer.write("Hello world");
        writer.write("How are you?");
        writer.close();

        // to readfile
        Scanner sc = new Scanner(newFile);

//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
        sc.close();

         File myFile = new File("DemoFile.txt");
//         to delete file
         myFile.delete();
//        System.out.println(sc.next());
    }
}
