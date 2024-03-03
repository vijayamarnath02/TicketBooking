package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Controller.UserDetails_Controller;
import Model.dummy_Values;

public class displayPassanger {
	static List<String>  myArray = new ArrayList<>();
	dummy_Values ticket=new dummy_Values();
	UserDetails_Controller addNew =new UserDetails_Controller();
String data="";



	public int displayUserDetails(Map < String,Integer > userDetails) {
		 if (userDetails != null) {
	            System.out.println("User Details:");
	            userDetails.forEach((key, value) -> {
	                System.out.println(key);
	                data=key;
	                myArray.add(data);
	            });
	        
	            newUserAdd();
	            return 1; 
	                }
	            
	           
	         else {
	            System.out.println("User details could not be retrieved.");
	            return 0; 
	        }
	}
	public int TicketRemaining(float capacity) {
		if(capacity != 0) {
			 System.out.println("Ticket Cost:"+" "+ticket.getTicketCost());
			System.out.println("Ticket Capacity:"+" "+capacity);
			ticket.setCapacity(capacity);
			int totalSite=ticket.getTotalSite()-myArray.size();
			System.out.println("Ticket Site Remaining:"+""+totalSite);
			newUserAdd();
			return 1;
		}
		else {
			return 0;
		}
	}
	public static boolean newUserAdd() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Added Other User Click 1. Or Enter Any Data");
		int addAccount=sc.nextInt();
		if(addAccount == 1) {
		
			TicketBooking_App.createUser(myArray);
		}
		else {
			System.out.println("Thankyou For Booking");
		}
		
		return true;
	}
	
	public List<String>  addUserData() {
		
		
		return myArray;
		
	}
	
	
	
	
	
}
