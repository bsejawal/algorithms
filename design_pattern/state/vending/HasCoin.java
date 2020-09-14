package design_pattern.state.vending;

public class HasCoin implements VendingState {
	VendingMachine vendingMachine;

	public HasCoin(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertCoin(Coin coin) {
		vendingMachine.setMachineState(vendingMachine.getCoinInserted());
		int value = vendingMachine.getCurrentAmount();
		if (value > 100) {
			System.out.println("You have already inserted enough");
		} 
		else
			vendingMachine.setCurrentAmount(value + coin.getValue());
		
		System.out.println("Your current amount : "+vendingMachine.getCurrentAmount());
		
		
		if(vendingMachine.getCurrentAmount() >= 50 ){
			vendingMachine.selectProductORInsertCoin();
		}else{
			vendingMachine.insertCoin();
		}
			
	}

	@Override
	public void pressButton(Product product) {
		if (vendingMachine.isAvailable(product) && vendingMachine.getCurrentAmount() >= product.getValue()) {
			vendingMachine.setMachineState(vendingMachine.getDispensing());
		}
	}

	@Override
	public void dispense() {
		System.out.println("Press product button first");

	}

}
