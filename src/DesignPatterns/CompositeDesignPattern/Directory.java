package DesignPatterns.CompositeDesignPattern;

import java.util.List;

public class Directory implements IFileSystem{
    private String name;
    List<IFileSystem> fileSystemList;

    public Directory(String name, List<IFileSystem> fileSystemList){
        this.name = name;
        this.fileSystemList = fileSystemList;
    }
    @Override
    public void ls() {
        System.out.println("Directory name : " + this.name);
        for(IFileSystem current : this.fileSystemList){
            current.ls();
        }
    }
}
