package DesignPatterns.MediatorDesignPattern;

public class MediatorDesignMainClass {
    public static void execute(){
        AuctionMediator auction1 = new Auction(200L);
        Colleague bidder1 = new Bidder("Rajiv", auction1);
        Colleague bidder2 = new Bidder("Rahul", auction1);
        Colleague bidder3 = new Bidder("Shubh", auction1);

        bidder1.placeBid(100L);
        bidder2.placeBid(250L);
        bidder1.placeBid(300L);
        bidder3.placeBid(500L);
    }
}
