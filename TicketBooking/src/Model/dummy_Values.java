package Model;

public class dummy_Values {
	private int totalSite;
	private float capacity;
	private int ticketCost;
	  public dummy_Values() {
	        this.totalSite = 50; 
	        this.capacity = 100; 
	        this.ticketCost = 150;
	    }
	public int getTotalSite() {
		return totalSite;
	}
	public float getCapacity() {
		return capacity;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTotalSite(int totalSite) {
		this.totalSite = totalSite;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	@Override
	public String toString() {
		return "dummy_Values [totalSite=" + totalSite + ", capacity=" + capacity + ", ticketCost=" + ticketCost
				+ "]";
	}
	
}
