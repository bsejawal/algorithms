package design_pattern.command;

//Create concrete classes implementing the Order interface.

public class BuyStock implements Order {

	private Stock stock;

	   public BuyStock(Stock stock){
	      this.stock = stock;
	   }

	@Override
	public void execute() {
		stock.buy();

	}

}
