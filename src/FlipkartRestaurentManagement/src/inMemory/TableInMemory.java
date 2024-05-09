package FlipkartRestaurentManagement.src.inMemory;

import FlipkartRestaurentManagement.src.entity.TableInfo;
import FlipkartRestaurentManagement.src.entity.TableReservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableInMemory {

    private final List<TableInfo> tableInfoList = new ArrayList<>();
    private final Long capacity = 10L;

    public List<TableInfo> getTableInfoList() {
        return tableInfoList;
    }

    public Long getCapacity() {
        return capacity;
    }

    public Map<String, TableReservation> getTableReservationMap() {
        return tableReservationMap;
    }

    private final Map<String, TableReservation> tableReservationMap = new HashMap<>();
    public TableInMemory(){
        for(int i=0;i<this.capacity;i++ ){
            TableInfo current = new TableInfo();
            current.setTableId(String.valueOf(i));
            tableInfoList.add(current);
        }
    }

}
