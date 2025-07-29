package com.eventorganizer.eventManagement.repository;

import com.eventorganizer.eventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event,Long>
{
    List<Event> findByNameContainingIgnoreCase(String name);

    List<Event> findByStartDateBetween(LocalDate startDate, LocalDate endDate);

    List<Event> findByUserId(Long userId);

}
