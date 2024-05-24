package MetroCard.model;


import MetroCard.enums.PersonType;
import MetroCard.enums.Stations;

public class Transactions {
    private String cardId;
    private PersonType passengerType;
    private Stations from;
    private Integer discountGiven;
    private Integer taxInvolved;

    public Integer getDiscountGiven() {
        return discountGiven;
    }

    public void setDiscountGiven(Integer discountGiven) {
        this.discountGiven = discountGiven;
    }

    public Integer getTaxInvolved() {
        return taxInvolved;
    }

    public void setTaxInvolved(Integer taxInvolved) {
        this.taxInvolved = taxInvolved;
    }

    public Transactions(String card, PersonType personType, Stations from) {
        this.cardId = card;
        this.passengerType = personType;
        this.from = from;
        this.taxInvolved = 0;
        this.discountGiven = 0;
    }

    public PersonType getPassengerType() {
        return passengerType;
    }

    public String getCardId() {
        return cardId;
    }

    public Stations getFrom() {
        return from;
    }

}
