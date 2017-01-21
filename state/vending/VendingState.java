package state.vending;

public interface VendingState {
	void insertCoin(Coin coin);
	void pressButton(Product product);
	void dispense();

}
