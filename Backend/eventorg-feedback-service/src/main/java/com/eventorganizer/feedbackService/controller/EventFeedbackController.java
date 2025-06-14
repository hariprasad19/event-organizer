package com.eventorganizer.feedbackService.controller;

import com.eventorganizer.feedbackService.model.EventFeedback;
import com.eventorganizer.feedbackService.service.EventFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class EventFeedbackController
{

    @Autowired
    private EventFeedbackService feedbackService;

//    @GetMapping("/event/{eventId}")
//    public ResponseEntity<List<EventFeedbackDTO>> getFeedbackByEventId(@PathVariable Long eventId) {
//        return ResponseEntity.ok(feedbackService.getFeedbackByEventId(eventId));
//    }
//
//    @PostMapping
//    public ResponseEntity<EventFeedbackDTO> createFeedback(@RequestBody EventFeedbackDTO feedbackDTO) {
//        return ResponseEntity.ok(feedbackService.createFeedback(feedbackDTO));
//    }
//
//    @PutMapping("/{feedbackId}")
//    public ResponseEntity<EventFeedbackDTO> updateFeedback(@PathVariable Long feedbackId,
//                                                           @RequestBody EventFeedbackDTO feedbackDTO) {
//        return ResponseEntity.ok(feedbackService.updateFeedback(feedbackId, feedbackDTO));
//    }

    @DeleteMapping("/{feedbackId}")
    public ResponseEntity<Void> deleteFeedback(@PathVariable Long feedbackId) {
        feedbackService.deleteFeedback(feedbackId);
        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/{feedbackId}")
//    public ResponseEntity<EventFeedbackDTO> getFeedbackById(@PathVariable Long feedbackId) {
//        return ResponseEntity.ok(feedbackService.getFeedbackById(feedbackId));
//    }

    @PostMapping
    public EventFeedback submitFeedback(@RequestParam Long clientId, @RequestParam Long eventId, @RequestParam String feedbackText) {
        return feedbackService.submitFeedback(clientId, eventId, feedbackText);
    }
}
