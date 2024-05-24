package MetroCard.services;


import MetroCard.dao.MetroCardInmemory;
import MetroCard.exceptionHandler.CardNotFoundException;
import MetroCard.model.MetroCard;

public class MetroCardService {
    private MetroCardInmemory metroCardInmemory;
    public MetroCardService(MetroCardInmemory metroCardInmemory){
        this.metroCardInmemory = metroCardInmemory;
    }

    public void addCard(String id, Integer amount){
        this.metroCardInmemory.addCard(new MetroCard(id, amount));
    }

    public MetroCard getCard(String id) throws CardNotFoundException {
            return this.metroCardInmemory.getCard(id);
    }
}
