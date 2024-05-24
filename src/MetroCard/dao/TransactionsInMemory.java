package MetroCard.dao;


import MetroCard.enums.PersonType;
import MetroCard.model.Transactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TransactionsInMemory {
    private static List<Transactions> transactionList=new ArrayList<>();
    private static HashMap<String, List<Transactions>> cardwiseTransactions = new HashMap<>();
    private static HashMap<PersonType, Integer> fare = new HashMap<>();

    public TransactionsInMemory(){
        fare.put(PersonType.ADULT, 200);
        fare.put(PersonType.KID, 50);
        fare.put(PersonType.SENIOR_CITIZEN, 100);
    }

    public void addTransactions(Transactions transactions){
        transactionList.add(transactions);
        if(!cardwiseTransactions.containsKey(transactions.getCardId())){
           cardwiseTransactions.put(transactions.getCardId(), new ArrayList<>());
        }
        cardwiseTransactions.get(transactions.getCardId()).add(transactions);
    }

    public List<Transactions> getAllTransactions(){
        return this.transactionList;
    }

    public List<Transactions> getTransactionByCard(String cardId){
        if(!cardwiseTransactions.containsKey(cardId)){
            return new ArrayList<>();
        }

        return cardwiseTransactions.get(cardId);
    }

    public Integer getFare(PersonType personType){
        return fare.get(personType);
    }

}
