package state.vending;

public enum Coin {
	NICKLE("Nickle", 5), DIME("Dime", 10), QUARTER("Quarter", 25);

	String name;
	int value;

	Coin(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public static Coin getByValue(int c) {
		for (Coin co : Coin.values()) {
			if (co.value == c)
				return co;
		}
		return null;
	}

}
