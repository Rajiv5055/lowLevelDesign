package MetroCard.services;


import MetroCard.dao.TransactionsInMemory;
import MetroCard.enums.Constants;
import MetroCard.enums.PersonType;
import MetroCard.enums.Stations;
import MetroCard.exceptionHandler.CardNotFoundException;
import MetroCard.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransactionService {

    private final MetroCardService metroCardService;
    private final TransactionsInMemory transactionsInMemory;


    public TransactionService(MetroCardService metroCardService, TransactionsInMemory transactionsInMemory) {
        this.metroCardService = metroCardService;
        this.transactionsInMemory = transactionsInMemory;
    }

    public void addTransaction(String card, PersonType personType, Stations from) throws CardNotFoundException {
        Transactions transaction = new Transactions(card, personType, from);

        caculateAndDeductCharge(card, personType, from, transaction);

        this.transactionsInMemory.addTransactions(transaction);
    }

    public void printSummary() {
        printForStation(Stations.CENTRAL);
        printForStation(Stations.AIRPORT);
    }

    private void printForStation(Stations stations) {
        Integer discountAmount = 0, totalAmount = 0;
        int adult = 0, senior = 0, child = 0;
        for (Transactions current : this.transactionsInMemory.getAllTransactions()) {
            if (current.getFrom().equals(stations)) {
                discountAmount += current.getDiscountGiven();
                totalAmount += ( transactionsInMemory.getFare(current.getPassengerType()) - current.getDiscountGiven() + current.getTaxInvolved());
                if (current.getPassengerType().equals(PersonType.KID)) child++;
                else if (current.getPassengerType().equals(PersonType.SENIOR_CITIZEN)) senior++;
                else adult++;
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(adult, 0))); // 0 -> Adult
        list.add(new ArrayList<>(Arrays.asList(adult, 1))); // 1 -> kid
        list.add(new ArrayList<>(Arrays.asList(adult, 2))); // 2 -> senior
        list.stream().sorted();
        System.out.println(Constants.TOTAL_COLLECTION + stations + " " + totalAmount + " " + discountAmount);
        System.out.println(Constants.PASSENGER_TYPE_SUMMARY);
        for (List<Integer> curent : list) {
            if (curent.get(0) != 0)
                System.out.println(getPersonType(curent.get(1)) + " " + curent.get(0));
        }
    }

    private String getPersonType(int i){
        if(i==0) return PersonType.ADULT.name();
        if(i==1) return PersonType.KID.name();
        return PersonType.SENIOR_CITIZEN.name();
    }

    private Integer caculateAndDeductCharge(String card, PersonType personType, Stations from, Transactions transactions) throws CardNotFoundException {
        List<Transactions> transactionList = transactionsInMemory.getTransactionByCard(card);
        Integer fare = transactionsInMemory.getFare(personType);
        MetroCard metroCard = metroCardService.getCard(card);

        if (eligibleForDiscount(from, transactionList)) {
            fare = fare/2;
            transactions.setDiscountGiven(fare);
        }

        if (metroCard.getAmount() < fare) {
            fare = (int) (fare + (fare - metroCard.getAmount())*2/100);
            transactions.setTaxInvolved(2*(fare - metroCard.getAmount())/100);
        }

        metroCardService.getCard(card).setAmount(Math.max(0, metroCard.getAmount() - fare));
        return fare;
    }

    private boolean eligibleForDiscount(Stations from, List<Transactions> transactionList) {
        boolean discountGiven = false;

        if(transactionList.isEmpty()){
            return false;
        }

        for (int i = 1; i < transactionList.size(); i++) {
            if (!transactionList.get(i - 1).getFrom().equals(transactionList.get(i).getFrom()) && !discountGiven) {
                discountGiven = true;
            } else if (discountGiven) {
                discountGiven = false;
            }
        }

        return !discountGiven && !transactionList.get(transactionList.size() - 1).getFrom().equals(from);
    }

}
