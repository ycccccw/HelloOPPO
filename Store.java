public class Store {
	String productType;
	
	//构造函数
	public Store(String product) {
		
		productType = product;
		
		System.out.println("I am inside the constructor method");

		
	}
	public static void main(String[] args) {
		
		System.out.println("Start of the main method.");
		
		Store lemonadeStand = new Store("lemonadeStand");
		
		System.out.println(lemonadeStand);
		
		System.out.println(lemonadeStand.productType);

	}
	
}