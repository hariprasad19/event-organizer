package com.eventorganizer.feedbackService.repository;
import com.eventorganizer.feedbackService.model.EventFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventFeedbackRepository extends JpaRepository<EventFeedback,Long>
{
//    List<EventFeedback> findByClientId(Long clientId);
      List<EventFeedback> findByEventId(Long eventId);
}
