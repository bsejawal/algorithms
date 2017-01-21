package state.vending;

public class Empty implements VendingState {

	VendingMachine vendingMachine;

	public Empty(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertCoin(Coin coin) {
		System.out.println("Product are out of stuck");

	}

	@Override
	public void pressButton(Product product) {
		System.out.println("Product are out of stuck");

	}

	@Override
	public void dispense() {
		System.out.println("Product are out of stuck");

	}

}
