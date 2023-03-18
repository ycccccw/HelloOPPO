public class Store4 {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store4(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
    
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
    
  }
 
  public double getPriceWithTax(){
	  double tax = 0.08;
	  double totalPrice = price + price * tax;
	  return totalPrice;

	}
  
  // main method
  public static void main(String[] args) {
    Store4 lemonadeStand = new Store4("Lemonade", 3.75);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.price);
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
    
  }
}