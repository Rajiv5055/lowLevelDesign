package DesignPatterns.MediatorDesignPattern;

public interface AuctionMediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, Long bidAmount) ;

}
