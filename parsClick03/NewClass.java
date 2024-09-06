package parsClick03;

public class NewClass {
    private String girlName;
    public void setName(String name){
        girlName = name;

    }
    public String getName() {
        return girlName;
    }
    public void saying() {
        System.out.printf("That's your girl name %s ",getName());
    }



}
