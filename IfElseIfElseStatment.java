public class IfElseIfElseStatment {
    public static void main(String[] args) {

        float sellingPrice = 1200, costPrice = 1000;
        if(sellingPrice > costPrice)
             System.out.println("profit");
        else if(costPrice > sellingPrice)
            System.out.println("Loss");
        else
            System.out.println("No Profit No Loss");



        if(sellingPrice > costPrice)
        System.out.println("profit");
        else {
            if (costPrice > sellingPrice)
                System.out.println("Loss");
            else
                System.out.println("No Profit No Loss");

        }
    }
}