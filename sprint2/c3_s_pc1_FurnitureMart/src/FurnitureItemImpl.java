import java.util.Scanner;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FurnitureItem obj = new FurnitureItem();
        System.out.println("For which type of usage do you want");
        obj.furnitureUsage = sc.nextLine();
        System.out.println("Which Furniture you want");
        obj.furnitureType = sc.nextLine();
        System.out.println("Which Colour of Furniture do you want");
        obj.colourOfFurniture = sc.nextLine();
        System.out.println("Enter the grade of the Furniture");
        obj.gradeOfFurniture = sc.nextDouble();
        System.out.println("Enter price of the Furniture");
        obj.furniturePrice = sc.nextDouble();


        if (obj.furnitureUsage.equals("outdoor")) {

            double discount = obj.furniturePrice * 0.05;
            obj.furniturePrice = obj.furniturePrice - discount;


            System.out.println("Amount after discount is : " + obj.furniturePrice);


        } else {
            System.out.println("Discount is not available ");


        }


    }

}
