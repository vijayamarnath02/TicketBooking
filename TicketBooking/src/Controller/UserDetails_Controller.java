package Controller;
import Model.dummy_Values;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.PassengerDetails;

public class UserDetails_Controller {
	 Map<String, Integer> map = new HashMap<>();
	 dummy_Values ticket=new dummy_Values();
	 PassengerDetails user =new PassengerDetails();
	 float totalCapacity=ticket.getCapacity();
	 
	 public int addUserDatainMap(List<String> data) {
		 for(int i=0;i<data.size();i++) {
			 map.put(data.get(i), map.size() + 1);
		 }
		 return 1;
	 }
	 
public  Map<String, Integer> userDetails(String userInfo ) {
	System.out.println(map);
	String Pnr="PNR00";
	  int mapLength = map.size()+1;
	String name= extractValue(userInfo,"name"); 
	float capacity=Float.parseFloat(extractValue(userInfo,"capacity"));
	totalCapacity=totalCapacity-capacity;
	if(totalCapacity<0) {
		System.out.print("Sry Ticket Has Been Overed");
		return null;
	}
	int balance=Integer.parseInt(extractValue(userInfo,"balance"));
	String activities=extractValue(userInfo,"activities");
	String subscription=extractValue(userInfo,"subscription");
	String City=extractValue(userInfo,"City");
	 Pnr=Pnr+mapLength;
	 user.setPnr(Pnr);
	 user.setName(name);
	 user.setBalance(balance);
	 user.setActivities(activities);
	 user.setCapacity(capacity);
	 user.setSubscription(subscription);
	 user.setCity(City);
	 map.put(user.toString(), map.size() + 1);
	 
return map;
}
public float Capacity() {
	ticket.setCapacity(totalCapacity);
	
	return totalCapacity;
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





}
