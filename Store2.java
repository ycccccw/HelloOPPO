public class Store2 {
  // instance fields
  String productType;
  
  // constructor method
  public Store2(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }

  public void greetCustomer(String customer){
    System.out.println("Welcome to the store, " + customer + "!");
  }

  // main method
  public static void main(String[] args) {
    Store2 lemonadeStand = new Store2("Lemonade");

    lemonadeStand.greetCustomer("ycw");
  }
}