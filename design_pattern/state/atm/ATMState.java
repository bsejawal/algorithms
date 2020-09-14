package design_pattern.state.atm;

public interface ATMState {
	void insertCard();
	void ejectCard();
	void insertPin(int pinEntered);
	void requestCash(int cashToWithdraw);

}
