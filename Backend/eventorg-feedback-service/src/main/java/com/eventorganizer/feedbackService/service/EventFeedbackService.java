package com.eventorganizer.feedbackService.service;

import com.eventorganizer.feedbackService.dto.EventFeedbackDTO;
import com.eventorganizer.feedbackService.model.EventFeedback;

import java.util.List;

public interface EventFeedbackService
{
    public EventFeedbackDTO createFeedback(EventFeedbackDTO feedbackDTO);
    public EventFeedbackDTO updateFeedback(Long feedbackId, EventFeedbackDTO feedbackDTO);
    public void deleteFeedback(Long feedbackId);
    public EventFeedbackDTO getFeedbackById(Long feedbackId);
    public List<EventFeedbackDTO> getFeedbackByEventId(Long eventId);
    public EventFeedback submitFeedback(Long clientId, Long eventId, String feedbackText);
}
