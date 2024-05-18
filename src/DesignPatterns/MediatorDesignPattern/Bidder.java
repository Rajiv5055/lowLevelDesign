package DesignPatterns.MediatorDesignPattern;

public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator){
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBidder(this);
    }
    @Override
    public void placeBid(Long bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(Long bidAmount) {
        System.out.println("Bidder : "+ name + "get notification that bid had been set to : " + bidAmount);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
