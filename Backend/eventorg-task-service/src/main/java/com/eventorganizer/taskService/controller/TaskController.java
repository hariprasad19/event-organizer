package com.eventorganizer.taskService.controller;

import com.eventorganizer.taskService.model.Task;
import com.eventorganizer.taskService.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/task")
public class TaskController
{
    @Autowired
    private TaskService taskService;

    @GetMapping("/event/{eventId}")
    public List<Task> getTasksByEventId(@PathVariable Long eventId) {
        return taskService.getTasksByEventId(eventId);
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{taskId}")
    public Task updateTask(@PathVariable Long taskId, @RequestBody Task updatedTask) {
        return taskService.updateTask(taskId, updatedTask);
    }

    @DeleteMapping("/{taskId}")
    public void deleteTask(@PathVariable Long taskId) {
        taskService.deleteTask(taskId);
    }
}
