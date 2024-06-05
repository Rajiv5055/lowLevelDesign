package MetroCard;

import MetroCard.dao.MetroCardInmemory;
import MetroCard.dao.TransactionsInMemory;
import MetroCard.enums.Commands;
import MetroCard.enums.PersonType;
import MetroCard.enums.Stations;
import MetroCard.exceptionHandler.CardNotFoundException;
import MetroCard.services.MetroCardService;
import MetroCard.services.TransactionService;

import java.io.FileInputStream;
import java.util.Scanner;

public class MetroCard {
    public static void execute(String[] args) {

        MetroCardInmemory metroCardInmemory = new MetroCardInmemory();
        MetroCardService metroCardService = new MetroCardService(metroCardInmemory);
        TransactionsInMemory transactionsInMemory = new TransactionsInMemory();
        TransactionService transactionService = new TransactionService(metroCardService, transactionsInMemory);

        // testCases
        String input1 = "D:\\LowLevelDesign\\src\\MetroCard\\sample_input\\input1.txt";
        String input2 = "D:\\LowLevelDesign\\src\\MetroCard\\sample_input\\input2.txt";

//        Sample code to read from file passed as command line argument
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(input1);
            Scanner sc = new Scanner(fis); // file to be scanned

            while (sc.hasNextLine()) {
                Commands command = Commands.valueOf(sc.next());
                switch (command) {
                    case BALANCE : {
                        balanceCommand(sc, metroCardService);
                        break;
                    }
                    case CHECK_IN: {
                        checkInCommand(sc, transactionService);
                        break;
                    }
                    case PRINT_SUMMARY : {
                        transactionService.printSummary();
                        break;
                    }
                    default: {
                        System.out.println("Invalid command");
                    }
                }
            }
            sc.close(); // closes the scanner
        } catch (Exception e) {
            System.out.println("Error occurred : " + e.getMessage());
        }
    }

    private static void balanceCommand(Scanner sc, MetroCardService metroCardService) {
        String cardId = sc.next();
        Integer balance = sc.nextInt();
        metroCardService.addCard(cardId, balance);
    }
    /*

     */
    private static void checkInCommand(Scanner sc, TransactionService transactionService) throws CardNotFoundException, CardNotFoundException {
        String cardId = sc.next();
        PersonType passengerType = PersonType.valueOf(sc.next());
        Stations from = Stations.valueOf(sc.next());
        transactionService.addTransaction(cardId, passengerType, from);
    }


}
