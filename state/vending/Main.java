package state.vending;

public class Main {
	static Coin nickle = Coin.NICKLE; // 5
	static Coin dime = Coin.DIME; // 10
	static Coin quarter = Coin.QUARTER; // 25

	static Product cola = Product.COLA; // 100
	static Product chips = Product.CHIPS; // 50
	static Product candy = Product.CANDY; // 65

	public static void main(String[] args) {

		VendingMachine machine = new VendingMachine();
		machine.insertCoin();
//		System.out.println(machine.getCurrentAmountCoin());
		

	}

	public static void insertCoin(VendingMachine machine) {
//		machine.insertCoin(5);
	}
	public static void reFill(VendingMachine machine){
		
		machine.reFill(Product.CANDY, 3);
		machine.reFill(Product.CHIPS, 5);
		machine.reFill(Product.COLA, 2);
	}

}
