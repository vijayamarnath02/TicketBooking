package Model;

import java.util.HashMap;
import java.util.Map;

public class Select_City {
	private int id;
	private String activityName;
	private int cost;
	
    public  Select_City(int id, String activityName, int cost) {
        this.id = id;
        this.activityName = activityName;
        this.cost = cost;
    }

	
	
	public int getId() {
		return id;
	}
	public String getActivityName() {
		return activityName;
	}
	public int getCost() {
		return cost;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public void setCost(int cost) {
		cost = cost;
	}
	@Override
	public String toString() {
		return "Select_City [id=" + id + ", activityName=" + activityName + ", Cost=" + cost + "]";
	}
	
}
