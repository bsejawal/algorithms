package state.vending;

public enum Product {
	COLA("cola", 100),
	CHIPS("chips", 50),
	CANDY("candy", 65);
	
	String name;
	int value;
	
	Product(String name, int value){
		this.name = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}