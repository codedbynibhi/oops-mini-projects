// public class statickey{
//     static String college;
//     String name;
//     void getinfo(){
        
//     }
    
//     public static void main(String[] args){
//         System.out.println(name);
//         statickey sc = new statickey();
//         sc.college ="chitkara";
//         sc.name = "riya";
//         sc.getinfo();
        
//     }
// }
// class customer{
//     static String college ="chitkara";
//     static String name ="nibhi";
//     static void getinfo(){
//         System.out.println(college);
//         System.out.println(name);
        
        
//     }
//     static void dosome(int payment){
//         getinfo();
//         System.out.println(payment);
//     }
// }
// public class ucampus {
//     public static void main(String[] args) {
//         customer.dosome(100);
//         System.out.println();
//         customer.dosome(300);
//     }
// }
// Share
// Chitkara
// UCampus has one central cafeteria that serves students and staff. Every food item belongs to the same cafeteria, and the cafeteria has a common service charge that applies to all food items.
// Develop a Java program to manage the cafeteria menu.
// Create a class named Foodltem.
// Instance Variables
// - int itemld
// - String itemName
// - double price
// Static Variables
// - String cafeteriaName = "UCampus Cafeteria"
// - double serviceCharge = 10.0
// - int totalFooditems = 0
// Instance Methods
// 1. addFooditem(int id, String name, double price)
// • Assign values to the instance variables.
// • Increase totalFooditems by 1 whenever a new food item is added.
// 2, calculateFinalPrice)
// • Final Price = Price + (Price * Service Charge / 100)
// 3. displayltemDetails)
// • Display Item ID, Item Name, Original Price, and Final Price.
// Static Methods
// 1. changeServiceCharge(double newCharge)
// • Update the service charge for the careteria.
// 2. displayCafeteriaDetails
// • Disptay Cafeteria Name, Current Service Charge, and To S fIt
// Sample Driver Code
// Fooditem item1 = new Foodltem);
// Foodltem item2 = new Foodltem);
// Fooditem item = new FoodItem);
// item1.addFoodltem(101, "Veg Sandwich", 80); item2.addFoodltem(102, "Cold Coffee", 120); item3.addFoodltem(103, "Paneer Wrap", 150);
// Foodltem.displayCafeteriaDetails();
// item1 .displayltemDetails);
// item2.displayltemDetails();
// item3.displayltemDetails();
// Foodltem.changeServiceCharge(15);
// System.out.println("After Updating Service Charge"); item1 displayltemDetails ();
// item2.displayltemDetails();
// item3.displayltemDetails();
// 100%
// ENG
// 你
// 1526
// 08-07-26
// &DCC
class FoodItem{
    int itemid;
    String itemname;
    double price;
   static String  cafeteriaName = "UCampus Cafeteria";
   static double serviceCharge = 10.0;
   static int totalFoodItems = 0;
    void addFoodItem(int itemid,String itemname,double price){
        this.itemid = itemid;
        this.itemname = itemname;
        this.price = price;
        totalFoodItems++;

    }
    void  calculateFinalPrice(){
        System.out.println(price+(price*serviceCharge/100));
    }
    void displayItemDetails(){
        System.out.println(itemid);
        System.out.println(itemname);
        System.out.println(price);
        System.out.println();
    }
    static void  changeServiceCharge(double newCharge){
        serviceCharge = newCharge;

      
     }
     static void displayCafeteriaDetails(){
               System.out.println(cafeteriaName);
               System.out.println(serviceCharge);
               System.out.println(totalFoodItems );
     }

}
public class ucampus{
    public static void main(String[] args) {
        FoodItem item1 = new FoodItem();
FoodItem item2 = new FoodItem();
FoodItem item3 = new FoodItem();
item1.addFoodItem(101, "Veg Sandwich", 80);
item2.addFoodItem(102, "Cold Coffee", 120);
item3.addFoodItem(103, "Paneer Wrap", 150);
FoodItem.displayCafeteriaDetails();
item1.displayItemDetails();
item2.displayItemDetails();
item3.displayItemDetails();
FoodItem.changeServiceCharge(15);
System.out.println("After Updating Service Charge");
item1.displayItemDetails();
item2.displayItemDetails();
item3.displayItemDetails();
    }

}