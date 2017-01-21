package state.vending;

public class NoCoin implements VendingState {
	
	VendingMachine vendingMachine;
	
	public NoCoin(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertCoin(Coin coin) {
		vendingMachine.setCurrentAmount(coin.getValue());
		vendingMachine.setMachineState(vendingMachine.getCoinInserted());
		vendingMachine.insertCoin();
	}

	@Override
	public void pressButton(Product product) {
		System.out.println("Insert coin first");
	}


	@Override
	public void dispense() {
		System.out.println("Insert coin first");
	}

}
