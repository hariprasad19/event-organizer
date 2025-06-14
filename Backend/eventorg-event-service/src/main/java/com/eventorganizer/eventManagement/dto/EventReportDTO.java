package com.eventorganizer.eventManagement.dto;

import lombok.Data;

import java.util.List;

@Data
public class EventReportDTO
{
    private EventDTO eventDetails;
    private List<GuestDTO> guestDetails;
    private List<VendorDTO> vendorDetails;
    private List<TaskDTO> taskDetails;
//    private ClientDTO clientDetails;
//    private List<FeedbackDTO> feedbackDetails;

}
