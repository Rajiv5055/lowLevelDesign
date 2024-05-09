package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.User;

import java.util.List;

public interface TableReservationService {
        public void reserveTables(List<String> tableList, String reservedBy, User staff, String reservationId);

        public void unReserve(String reservationId, User staff);

}
