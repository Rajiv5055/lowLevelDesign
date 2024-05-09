package CleartripSolution.src;

import CleartripSolution.src.InMemory.AirLineInMemory;
import CleartripSolution.src.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import CleartripSolution.src.InMemory.*;

public class CleartripSolution {
    public void execute() {

        Scanner sc = new Scanner(System.in);
        UserInMemory userInMemory = new UserInMemory();
        AirLineInMemory airLineInMemory = new AirLineInMemory();

        while (true) {
            try {
                String command = sc.next();
                switch (command) {
                    case "ADDUSER": {
                        String userDetail = sc.nextLine();
                        String[] userDetails = userDetail.split(" ");
                        UserDTO user = new UserDTO(userDetails[1], userDetails[2], Double.parseDouble(userDetails[3]));
                        userInMemory.addUser(user);
                        break;
                    }
                    case "SEARCHFLIGHT": {
                        String search = sc.nextLine();
                        String[] searchDetail = search.split(" ");
                        airLineInMemory.SearchFlight(searchDetail[1], searchDetail[2], Long.parseLong(searchDetail[3]), Long.parseLong(searchDetail[4]));
                        break;
                    }
                    case "BOOK": {
                        String book = sc.nextLine();
                        String[] bookingDetail = book.split(" ");
                        UserDTO user = userInMemory.findUser(bookingDetail[1]);
                        List<String> seats = new ArrayList<>();
                        for (int i = 8; i < bookingDetail.length; i++) seats.add(bookingDetail[i]);
                        airLineInMemory.bookTicket(user, bookingDetail[2], bookingDetail[3], bookingDetail[4], bookingDetail[5], Long.parseLong(bookingDetail[6]), bookingDetail[7], seats);
                    }
                    default: {
                        System.out.println("Invalid command");
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception Occurred : " + e.getMessage());
            }

        }

    }
}