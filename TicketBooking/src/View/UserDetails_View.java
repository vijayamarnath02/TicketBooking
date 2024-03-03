package View;
import java.util.Scanner;
import Model.PassengerDetails;
import Model.dummy_Values;
public class UserDetails_View {
    public String userData() {
        Scanner sc = new Scanner(System.in);
        PassengerDetails passenger = new PassengerDetails();
        System.out.println("Please Enter The Name");
        String name = sc.nextLine();
        System.out.println("Please Enter The Amount");
        int amount = sc.nextInt();
        System.out.println("Please Enter The Passenger Capacity");
        float capacity = sc.nextFloat();
        if (!name.isEmpty() && amount != 0) {
            dummy_Values ticket = new dummy_Values();
            amount = amount - ticket.getTicketCost();
            if (amount > 0) {
                passenger.setName(name);
                passenger.setBalance(amount);
                passenger.setCapacity(capacity);
                String userDeatils = passenger.toString();
                return userDeatils.toString();
            } else {
                System.out.println("Please Enter The Amount Corectly");
                return null;
            }
        } else {
            return null;
        }
    }
}