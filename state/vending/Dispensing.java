package state.vending;


public class Dispensing implements VendingState {

	VendingMachine vendingMachine;
	Product selectedProduct; 

	public Dispensing(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	
	@Override
	public void insertCoin(Coin coin) {
		System.out.println("You have already inserted enough");
	}

	@Override
	public void pressButton(Product product) {
		selectedProduct = product;
		if(!vendingMachine.isAvailable(product)){
			System.out.println("Currently "+product.getName()+" is out of stock, you can select other");
			vendingMachine.selectProductORInsertCoin();
		}else{
			vendingMachine.setMachineState(vendingMachine.getDispensing());
			dispense();
		}

	}

	@Override
	public void dispense() {
		vendingMachine.getProducts().put(selectedProduct.getName(), vendingMachine.getProducts().get(selectedProduct.getName())-1);
		vendingMachine.collectCoin(selectedProduct);
		
		System.out.println(selectedProduct.getName()+" : "+selectedProduct.value +", Change : "+ vendingMachine.getCurrentAmount());
		vendingMachine.returnAmount();
		
	}

}
