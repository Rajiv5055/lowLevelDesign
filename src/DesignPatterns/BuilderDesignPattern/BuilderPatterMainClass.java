package DesignPatterns.BuilderDesignPattern;

public class BuilderPatterMainClass {

    public static void execute(){
        StudentClass studentClass = new StudentClass().setId("1").setName("Rajiv").setContactNumber("7987598940");

        System.out.println(studentClass.getId() + " "+ studentClass.getName() + " " + studentClass.getContactNumber());
    }
}
