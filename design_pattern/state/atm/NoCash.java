package design_pattern.state.atm;

public class NoCash  implements ATMState{
	// Context
	ATMMachine atmMachine;

	public NoCash(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("We Don't have Money");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("We Don't have money. you didn't enter a card");
		
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("We Don't have Money");
		
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("We Don't have Money");
		
	}

}
