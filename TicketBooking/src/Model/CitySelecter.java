package Model;

public class CitySelecter {
	private int id;
	private String cityName;
	private int cost;
	
    public CitySelecter(int id, String cityName, int cost) {
        this.id = id;
        this.cityName = cityName;
        this.cost = cost;
    }

	public int getId() {
		return id;
	}

	public String getCityName() {
		return cityName;
	}

	public int getCost() {
		return cost;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
