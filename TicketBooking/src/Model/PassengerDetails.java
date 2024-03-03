package Model;

public class PassengerDetails {
	
	private String pnr;
	private String name;
	private float capacity;
	private int balance;
	private String activities;
	private String subscription;
	private String City;
	public String getPnr() {
		return pnr;
	}
	public String getName() {
		return name;
	}
	public float getCapacity() {
		return capacity;
	}
	public int getBalance() {
		return balance;
	}
	public String getActivities() {
		return activities;
	}
	public String getSubscription() {
		return subscription;
	}
	public String getCity() {
		return City;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "[pnr=" + pnr + ", name=" + name + ", capacity=" + capacity + ", balance=" + balance
				+ ", activities=" + activities + ", subscription=" + subscription + ", City=" + City + "]";
	}
	
}
