package MetroCard.dao;

import MetroCard.exceptionHandler.CardNotFoundException;

import java.util.ArrayList;
import  MetroCard.model.MetroCard;
import java.util.HashMap;
import java.util.List;

public class MetroCardInmemory {
    private static List<MetroCard> metroCardList = new ArrayList<>();
    private static HashMap<String, MetroCard> metroCardHashMap = new HashMap<>();

    public void addCard(MetroCard metroCard){
        metroCardList.add(metroCard);
        metroCardHashMap.put(metroCard.getId(), metroCard);

//        System.out.println("card added successfully");
    }

    public MetroCard getCard(String id) throws CardNotFoundException {
        if(!metroCardHashMap.containsKey(id)){
            throw new CardNotFoundException("Card is invalid");
        }

        return metroCardHashMap.get(id);
    }
}
