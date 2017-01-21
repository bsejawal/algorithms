package state.vending;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
	private VendingState coinInserted;
	private VendingState noCoinInserted;
	private VendingState empty;
	private VendingState dispensing;

	private VendingState machineState;
	private Map<String, Integer> products;
	private int currentAmount = 0;
	private Map<String, Integer> collectedMoney;
	Scanner scanner;

	public VendingMachine() {
		coinInserted = new HasCoin(this);
		noCoinInserted = new NoCoin(this);
		empty = new Empty(this);
		dispensing = new Dispensing(this);
		initializeProduct();
		initializeCollectedMoney();
		machineState = noCoinInserted;
	}

	public void reFill(Product product, int count) {
		initializeProduct();
		products.put(product.name, count);
		machineState = noCoinInserted;
	}

	
	public void insertCoin() {
		if (currentAmount > 0)
			System.out.println("Please insert more coin OR press x to cancel ");
		else
			System.out.println("Please insert coin OR press x to cancel ");
		System.out.println("");
		scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		if (line.equals("x"))
			returnAmount();
		else {
			int c = 0;
			try {
				c = Integer.parseInt(line);
			} catch (NumberFormatException e) {
				insertCoin();
				return;
			}

			Coin coin = Coin.getByValue(c);
			if (null == coin) {
				System.out.println(c
						+ " is invalid coin, Please insert one of the following \nQuarter - 25 cent OR \nDime - 10 cent OR \nNickle - 5 cent");
				insertCoin();
				return;
			} else {
				machineState.insertCoin(coin);
			}

		}
		scanner.close();
	}

	public void pressButton(Product product) {
		machineState = dispensing;
		machineState.pressButton(product);
	}

	public void printRemainingProducts() {
		for (Map.Entry<String, Integer> entry : products.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public boolean isAvailable(Product product) {
		if (products.get(product.name) > 0) {
			return true;
		}
		return false;
	}

	public VendingState getCoinInserted() {
		return coinInserted;
	}

	public void setCoinInserted(VendingState coinInserted) {
		this.coinInserted = coinInserted;
	}

	public VendingState getNoCoinInserted() {
		return noCoinInserted;
	}

	public void setNoCoinInserted(VendingState noCoinInserted) {
		this.noCoinInserted = noCoinInserted;
	}

	public VendingState getEmpty() {
		return empty;
	}

	public void setEmpty(VendingState empty) {
		this.empty = empty;
	}

	public VendingState getDispensing() {
		return dispensing;
	}

	public void setDispensing(VendingState dispensing) {
		this.dispensing = dispensing;
	}

	public VendingState getMachineState() {
		return machineState;
	}

	public void setMachineState(VendingState machineState) {
		this.machineState = machineState;
	}

	public Map<String, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<String, Integer> products) {
		this.products = products;
	}

	public int getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}

	public Map<String, Integer> getCollectedMoney() {
		return collectedMoney;
	}

	public void setCollectedMoney(Map<String, Integer> collectedMoney) {
		this.collectedMoney = collectedMoney;
	}

	public void collectMoney() {
		for (Map.Entry<String, Integer> entry : collectedMoney.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
		}
		initializeCollectedMoney();
	}

	public void initializeProduct() {
		if (products == null)
			products = new HashMap<>();
		// machine is filled with each product 20 qty
		products.put(Product.CANDY.getName(), 20);
		products.put(Product.COLA.getName(), 20);
		products.put(Product.CHIPS.getName(), 20);
	}

	public void initializeCollectedMoney() {
		if (collectedMoney == null)
			collectedMoney = new HashMap<>();
		collectedMoney.put(Coin.QUARTER.getName(), 0);
		collectedMoney.put(Coin.DIME.getName(), 0);
		collectedMoney.put(Coin.NICKLE.getName(), 0);
	}

	public void collectCoin(Product p) {
		int quarter = p.getValue() / 25;
		int dime = (p.getValue() - (quarter * 25)) / 10;
		int nickle = p.getValue() - (quarter * 25) - (dime * 10);
		collectedMoney.put(Coin.QUARTER.getName(), collectedMoney.get(Coin.QUARTER.getName()) + quarter);
		collectedMoney.put(Coin.DIME.getName(), collectedMoney.get(Coin.DIME.getName()) + dime);
		collectedMoney.put(Coin.NICKLE.getName(), collectedMoney.get(Coin.NICKLE.getName()) + nickle);
		currentAmount = currentAmount - p.getValue();
	}

	public String getCurrentAmountCoin() {
		return getExactCoinChange(currentAmount);
	}

	public String getExactCoinChange(int c) {
		String st = "";
		int quarter = c / 25;
		int dime = (c - (quarter * 25)) / 10;
		int nickle = (c - (quarter * 25) - (dime * 10)) / 5;

		if (quarter > 0)
			st = quarter + " " + Coin.QUARTER.getName();
		if (dime > 0) {
			if (st != "")
				st += ", ";
			st += dime + " " + Coin.DIME.getName();
		}

		if (nickle > 0) {
			if (st != "")
				st += ", ";
			st += nickle + " " + Coin.NICKLE.getName();
		}
		return st;

	}

	public void selectProductORInsertCoin() {
		if (currentAmount < 100) {
			System.out.println("Press 1 to insert more coin");
		}
		System.out.println("Please select the product");
		if (currentAmount >= Product.COLA.getValue() && products.get(Product.COLA.getName()) > 0)
			System.out.println("2 to press Cola, Price :" + Product.COLA.getValue());
		if (currentAmount >= Product.CANDY.getValue() && products.get(Product.CANDY.getName()) > 0)
			System.out.println("3 to press Candy, Price :" + Product.CANDY.getValue());
		if (currentAmount >= Product.CHIPS.getValue() && products.get(Product.CHIPS.getName()) > 0)
			System.out.println("4 to press Chips, Price :" + Product.CHIPS.getValue());
		System.out.println("5 to return your amount");
		char c = 0;
		try {
			c = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (c == '5') {
			returnAmount();
			return;
		} else if (c == '1' && currentAmount < 100) {
			insertCoin();
		} else {
			Product selectedProduct = getProduct(c);
			if (selectedProduct != null) {
				machineState = dispensing;
				machineState.pressButton(selectedProduct);
				
			}else{
				System.out.println("You have selected wrong product");
				selectProductORInsertCoin();
			}
		}

	}

	public void returnAmount() {
		System.out.println(getExactCoinChange(currentAmount));
		currentAmount = 0;
	}

	public Product getProduct(char c) {
		System.out.println(c);
		if (c == '2')
			return Product.COLA;
		if (c == '3')
			return Product.CANDY;
		if (c == '4')
			return Product.CHIPS;
		return null;
	}

}
