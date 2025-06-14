package com.eventorganizer.eventManagement.dto;

import com.eventorganizer.eventManagement.model.EventType;
import com.eventorganizer.eventManagement.model.Status;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EventDTO
{
    private Long id;
    private String name;
    private String title;
    private String location;
    private String description;
    private Double estimatedExpense;
    private Double actualExpense;

    private LocalDate startDate;
    private LocalDate endDate;
    private EventType type;
    private Status status;

}
