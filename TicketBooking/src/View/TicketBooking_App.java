package View;
import java.io.EOFException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import Model.PassengerDetails;
public class TicketBooking_App {
	static displayPassanger userData=new displayPassanger();
	 String [] userList=new String[10];
    public static void main(String[] args) {
    
    	List<String> userList=userData.addUserData();
    	
    	createUser(userList);
        }
    public static int createUser(List<String>userList) {
    	 Scanner sc = new Scanner(System.in);
         UserDetails_View user = new UserDetails_View();
         SelectCityView city = new SelectCityView();
        try {
            String checker = user.userData();
            while (checker == null) {
                checker = user.userData();
            }
            
            System.out.println("Let's Begin the Process...");
            int result = city.goingCity(checker,userList);
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
}