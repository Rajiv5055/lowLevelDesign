package DesignPatterns.CompositeDesignPattern;

public class File implements IFileSystem{

    private String content;
    private String name;

    public File(String name, String content){
        this.name = name;
        this.content = content;
    }
    @Override
    public void ls() {
        System.out.println(this.name + " : " + this.content);
    }
}
