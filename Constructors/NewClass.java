package Constructors;

public class NewClass {
    private String girlName;
    
    public NewClass(String name){
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.println("Your girl name is " +getName());

    }
}
