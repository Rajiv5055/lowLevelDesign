package FlipkartRestaurentManagement.src.entity;

public class TableInfo {
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    private String tableId;
    private Boolean isOccupied;
}
