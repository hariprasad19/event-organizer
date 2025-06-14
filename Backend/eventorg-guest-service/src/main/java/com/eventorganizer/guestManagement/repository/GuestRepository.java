package com.eventorganizer.guestManagement.repository;

import com.eventorganizer.guestManagement.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest,Long>
{
//    public Optional<Guest> findGuestByEventId(Long eventId);
//    public List<Guest> findByEventId(Long eventId);
//    public List<Guest> findByDietaryPreference(String dietaryPreference);

}
