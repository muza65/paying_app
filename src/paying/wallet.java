package paying;

public class wallet {
	private String id;
	double balance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void edit(double newbalance) {
		this.setBalance(newbalance);
	}
}
