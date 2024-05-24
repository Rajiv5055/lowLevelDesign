package MetroCard.model;

public class MetroCard {
    public MetroCard(String mc1, Integer i) {
        this.id = mc1;
        this.amount= i;
    }

    public String getId() {
        return id;
    }

    private String id;

    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount){
        this.amount = amount;
    }

    private Integer amount;
}
