package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.Staff;
import FlipkartRestaurentManagement.src.entity.TableInfo;
import FlipkartRestaurentManagement.src.entity.TableReservation;
import FlipkartRestaurentManagement.src.entity.User;
import FlipkartRestaurentManagement.src.inMemory.TableInMemory;

import java.util.ArrayList;
import java.util.List;

public class TableReservationServiceImp implements TableReservationService {

    TableInMemory tableInMemory = new TableInMemory();
    @Override
    public void reserveTables(List<String> tableList, String reservedBy, User staff, String reservationId) {
        if(!(staff instanceof Staff)){
            throw new RuntimeException("staff do not have permission to reserve");
        }

        boolean isTableAvailable= true;
        List<TableInfo> tableInfoList = new ArrayList<>();
        for(String tableId : tableList){
            for(TableInfo current : tableInMemory.getTableInfoList()){
                if(current.getTableId().equals(tableId) && current.getOccupied()){
                    isTableAvailable = false;
                    tableInfoList.add(current);
                }
            }
        }

        if(!isTableAvailable) throw new RuntimeException("Some tables are not available");

        for(String tableId : tableList){
            for(TableInfo current : tableInMemory.getTableInfoList()){
                if(current.getTableId().equals(tableId)){
                    current.setOccupied(true);
                    tableInfoList.add(current);
                }
            }
        }
        for(TableInfo curent : tableInfoList){
            curent.setOccupied(true);
        }

        TableReservation newReservation = new TableReservation();
        newReservation.setReservationId(reservationId);
        newReservation.setReservedBy(reservedBy);
        newReservation.setTableInfoList(tableInfoList);
        tableInMemory.getTableReservationMap().put(reservationId, newReservation);

        System.out.println("Tables reservation successful for user : " + reservedBy);

    }

    @Override
    public void unReserve(String reservationId, User staff) {
        if(!(staff instanceof Staff)){
            throw new RuntimeException("staff do not have permission to reserve");
        }

        if(!tableInMemory.getTableReservationMap().containsKey(reservationId)){
            throw new RuntimeException("reservation does not exist");
        }

        for(TableInfo reservedTable : tableInMemory.getTableReservationMap().get(reservationId).getTableInfoList()){
            for(TableInfo current : tableInMemory.getTableInfoList()){
                if(reservedTable.getTableId().equals(current.getTableId())){
                    current.setOccupied(false);
                }
            }
        }

        tableInMemory.getTableReservationMap().remove(reservationId);

        System.out.println("Reservation unreserved successfully");
    }
}
