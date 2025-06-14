package com.eventorganizer.taskService.service;

import com.eventorganizer.taskService.model.Task;

import java.util.List;

public interface TaskService
{
    public List<Task> getTasksByEventId(Long eventId);
    public Task createTask(Task task) ;
    public Task updateTask(Long taskId, Task updatedTask);
    public void deleteTask(Long taskId);
}
