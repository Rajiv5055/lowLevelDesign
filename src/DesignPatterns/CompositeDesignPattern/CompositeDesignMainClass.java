package DesignPatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class CompositeDesignMainClass {
    public static void execute(){
        IFileSystem file1 = new File("file1", "Hello world");
        IFileSystem file2 = new File("file2", "Thank you world");
        IFileSystem file3 = new File("file3", "Say hello");
        IFileSystem directory = new Directory("Files", new ArrayList<>(Arrays.asList(file1, file2, file3)));
        IFileSystem movieDirectory = new Directory("Movie", new ArrayList<>(Arrays.asList(directory)));

        movieDirectory.ls();
    }
}
