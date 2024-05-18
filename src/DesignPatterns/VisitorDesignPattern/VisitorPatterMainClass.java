package DesignPatterns.VisitorDesignPattern;

public class VisitorPatterMainClass {
    public static void execute(){
        RoomElementAbstract singleRoom = new SingleRoom();
        RoomElementAbstract doubleRoom = new DoubleRoom();

        IVisitor maintenanceService = new MaintenanceService();
        IVisitor priceService = new PriceService();

        singleRoom.accept(maintenanceService);
        doubleRoom.accept(maintenanceService);
        singleRoom.accept(priceService);
        doubleRoom.accept(priceService);
    }
}
