package DesignPatterns.MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleague> colleagueList;
    Colleague currentBidder;
    private Long currentAmount;

    public Auction(Long initialAmount){
        this.currentAmount = initialAmount;
        this.colleagueList = new ArrayList<>();
    }

    @Override
    public void addBidder(Colleague bidder) {
        colleagueList.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, Long bidAmount) {
        if(bidAmount <= currentAmount){
            System.out.println("Invalid bid");
            return;
        }

        currentBidder = bidder;
        currentAmount = bidAmount;

        for(Colleague current : this.colleagueList){
            if(!current.getName().equalsIgnoreCase(bidder.getName())){
                current.receiveNotification(bidAmount);
            }
        }

    }
}
