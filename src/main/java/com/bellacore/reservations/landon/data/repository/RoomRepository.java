package com.bellacore.reservations.landon.data.repository;

import com.bellacore.reservations.landon.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
//    Long - because id of room entity is long type
    Room findByNumber(String number);
}
