package View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Model.CitySelecter;
import Model.Select_City;
import Model.Userpackage;
public class ActivitySetter {
	displayPassanger display=new displayPassanger();
    public static List < CitySelecter > createCityList() {
        List < CitySelecter > cityList = new ArrayList < > ();
        cityList.add(new CitySelecter(1, "India", 100));
        cityList.add(new CitySelecter(2, "USA", 300));
        cityList.add(new CitySelecter(3, "London", 125));
        cityList.add(new CitySelecter(4, "Paris", 340));
        cityList.add(new CitySelecter(4, "Tokyo", 150));
        return cityList;
    }
    public int displayCity(List < CitySelecter > cityList) {
        for (CitySelecter i: cityList) {
            System.out.println("ID: " + i.getId());
            System.out.println("City Name: " + i.getCityName());
            System.out.println("Cost: " + i.getCost());
            System.out.println("-------------------------");
        }

        return 0;
    }
    public static List < Select_City > createActivities() {
        List < Select_City > activities = new ArrayList < > ();
        activities.add(new Select_City(1, "Football", 100));
        activities.add(new Select_City(2, "Basketball", 200));
        activities.add(new Select_City(3, "Basketball1", 300));
        activities.add(new Select_City(4, "Soccer", 150));
        activities.add(new Select_City(5, "Tennis", 250));

        return activities;
    }
    public int display(List < Select_City > activities) {
        for (Select_City activity: activities) {
            System.out.println("Activity ID: " + activity.getId());
            System.out.println("Activity Name: " + activity.getActivityName());
            System.out.println("Cost: " + activity.getCost());
            System.out.println("-------------------------");
        }
        
        return 0;
    }
    public static List < Userpackage > createPackageList() {
        List < Userpackage > activities = new ArrayList < > ();
        activities.add(new Userpackage(1, "Normal", "0%", 0, 100));
        activities.add(new Userpackage(2, "Gold", "10%", 10, 200));
        activities.add(new Userpackage(3, "Diamond+", "100%", 100, 100));
        
        return activities;
    }
    public int displayPackages(List < Userpackage > activities) {
        for (Userpackage i: activities) {
            System.out.println("Activity ID: " + i.getId());
            System.out.println("Activity Name: " + i.getPackageName());
            System.out.println("DisCount: " + i.getDiscount());
            System.out.println("Cost: " + i.getCost());
            System.out.println("-------------------------");
        }
        return 0;
    }
}