package View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import Controller.UserDetails_Controller;
import Model.Userpackage;
import Model.dummy_Values;
import Model.CitySelecter;
import Model.PassengerDetails;
import Model.Select_City;
public class SelectCityView {
	Scanner sc = new Scanner(System. in );
	int bal = 0;
	int dis = 0;
	String cityName = "";
	String activeName = "";
	ActivitySetter active = new ActivitySetter();
	PassengerDetails passanger = new PassengerDetails();
	dummy_Values ticket = new dummy_Values();
	UserDetails_Controller userInfo = new UserDetails_Controller();
	displayPassanger finalData = new displayPassanger();
	public int goingCity(String user,List<String> userData) {
		List < Userpackage > userPackages = active.createPackageList();
		active.displayPackages(userPackages);
		System.out.println("Select the Package You Want ");
		int packId = sc.nextInt();
		while (packId <= 0 || packId > userPackages.size()) {
			System.out.println("Please Enter The Correct Id of Package");
			packId = sc.nextInt();
		}

		for (Userpackage userPackage: userPackages) {
			if (userPackage.getId() == packId) {
				int balance = Integer.parseInt(extractValue(user, "balance"));
				String name = extractValue(user, "name");
				float capacity = Float.parseFloat(extractValue(user, "capacity"));
				bal = balance - userPackage.getCost();
				dis = userPackage.getDiscountValue();
				passanger.setName(name);
				passanger.setBalance(bal);
				passanger.setCapacity(capacity);
				passanger.setSubscription(userPackage.getPackageName());

			}
		}

		boolean continueSelection = true;
		while (continueSelection) {
			List < CitySelecter > cityList = active.createCityList();
			List < Select_City > activities = active.createActivities();
			active.displayCity(cityList);
			System.out.println("Select the City You Want To Go..");
			int cityId = sc.nextInt();
			while (cityId <= 0 || cityId > cityList.size()) {
				System.out.println("Please Select The Id of City");
				cityId = sc.nextInt();
			}
			int cityCheck = checingValue(cityList, cityId);
			while (cityCheck == 1) {
				System.out.println("You Already Select The Id of City");
				cityId = sc.nextInt();
				cityCheck = checingValue(cityList, cityId);
			}

			for (CitySelecter cityPackage: cityList) {
				if (cityPackage.getId() == cityId) {

					bal = bal - (cityPackage.getCost() * dis) / 100;
					if(bal < 0) {
						System.out.println("Not Amount Pending");
						return 0;
					}
					passanger.setBalance(bal);
					if (cityName != "") {
						cityName = cityName + " " + cityPackage.getCityName();
					}

					else {
						String citySelect = cityPackage.getCityName();
						cityName = cityPackage.getCityName();
					}

				}
				passanger.setCity(cityName);
			}
			if (cityId != 0) {
				active.display(activities);
				System.out.println("Select the Activity You Want To Go..");
				int activeId = sc.nextInt();
				while (activeId <= 0 || activeId > activities.size()) {
					System.out.println("Please Select The Id of Activity");
					activeId = sc.nextInt();
				}
				int activeCheck = activeValue(activities, activeId);
				while (activeCheck == 1) {
					System.out.println(" Select Activity is Executed");
					activeId = sc.nextInt();
					activeCheck = activeValue(activities, activeId);
				}

				for (Select_City activitiesPackage: activities) {
					if (activitiesPackage.getId() == activeId) {
						if (activeName != "") {
							activeName = activeName + " " + activitiesPackage.getActivityName();
						}

						else {

							activeName = activitiesPackage.getActivityName();
						}
						bal = bal - (activitiesPackage.getCost() * dis) / 100;
						if(bal < 0) {
							System.out.println("Not Amount Pending");
							return 0;
						}
						passanger.setBalance(bal);
						passanger.setActivities(activeName);
					}
				};
				if (activeId != 0) {
					System.out.println("Do you want to continue? (yes/no): ");
					String response = sc.next();
					if (response.toLowerCase().equals("yes")) {
						System.out.println(response.toLowerCase() == "yes");
						continueSelection = true;
					} else {
						continueSelection = false;
						Map < String,
						Integer > userDetails = userInfo.userDetails(passanger.toString());
						userInfo.addUserDatainMap(userData);
						float calacity = userInfo.Capacity();
						int menu=0;
					
				            System.out.println("Menu:");
				            System.out.println("1. List Of Users");
				            System.out.println("2. Balance Capacity");
				            System.out.println("3. Activites List View");
				            System.out.println("3. City List View");
				            System.out.print("Please select an option: ");
				             menu = sc.nextInt();
						while (menu < 1 || menu > 4 ) 
						{
				        	 System.out.println("Please select a valid menu option (1 or 4).");
				        	 menu = sc.nextInt();
				        }


						switch (menu) {
						case 1:
							finalData.displayUserDetails(userDetails);
							break;
						case 2:
							finalData.TicketRemaining(calacity);
							break;
						case 3:
							active.display(activities);
							break;
						case 4:
							active.displayCity(cityList);
							break;
						default:
							System.out.println("Invalid option selected.");
							break;

						}
					return 1;
					}
				
				}
			}

		}
		return 0;
	}

	private static String extractValue(String data, String attribute) {
		String key = attribute + "=";
		int startIndex = data.indexOf(key);
		if (startIndex != -1) {
			int endIndex = data.indexOf(",", startIndex);
			if (endIndex == -1) {
				endIndex = data.length() - 1;
			}
			return data.substring(startIndex + key.length(), endIndex);
		}
		return null;
	}
	public int checingValue(List < CitySelecter > cityList, int id) {
		for (CitySelecter cityPackage: cityList) {
			if (cityPackage.getId() == id) {
				if (cityName.contains(cityPackage.getCityName())) {
					return 1;
				}

				else {
					return 0;
				}
			}
		}
		return 0;
	}
	public int activeValue(List < Select_City > activeList, int id) {
		for (Select_City activePackage: activeList) {
			if (activePackage.getId() == id) {
				if (activeName.contains(activePackage.getActivityName())) {
					return 1;
				}

				else {
					return 0;
				}
			}
		}
		return 0;
	}
	


}