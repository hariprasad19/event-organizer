package com.eventorganizer.eventManagement.service;

import com.eventorganizer.eventManagement.dto.EventReportDTO;
import com.eventorganizer.eventManagement.dto.GuestDTO;
import com.eventorganizer.eventManagement.dto.VendorDTO;
import com.eventorganizer.eventManagement.exception.EventNotFoundException;
import com.eventorganizer.eventManagement.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventService
{
    public Event saveEvent(Event event);
    public List<Event> getAllEvents();
    public Event getEventById(Long id) throws EventNotFoundException;
    public void deleteEvent(Long id);
    public Event updateEvent(Long id, Event event) throws EventNotFoundException;

    public List<Event> searchEventsByName(String name) throws EventNotFoundException;
    public List<Event> searchEventsByDateRange(LocalDate startDate, LocalDate endDate) throws EventNotFoundException;
    public List<GuestDTO> getAllGuestsByEventId(Long id);
    public List<VendorDTO> getAllVendorsByEventId(Long id);
    public EventReportDTO getEventReport(Long EventId);
    public List<Event> getEventsByUserId(Long userId);
//    public void addVendorToEvent(Long eventId, Long vendorId);
//    public void assignEventToClient(Long eventId, Long clientId);

    public List<Event> getEventsByVendorId(Long vendorId);

}
