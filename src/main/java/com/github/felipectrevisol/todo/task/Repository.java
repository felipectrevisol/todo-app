package com.github.felipectrevisol.todo.task;

import org.springframework.stereotype.Component;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

@Component
public class Repository {
 
    @Async
    @EventListener
    public void save(final TaskCard task) {
        System.out.println("Saving task: " + task.title() + " with priority " + task.priority());
    }
}