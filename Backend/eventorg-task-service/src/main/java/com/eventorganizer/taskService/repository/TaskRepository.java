package com.eventorganizer.taskService.repository;

import com.eventorganizer.taskService.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long>
{
    List<Task> findByEventId(Long eventId);
}
