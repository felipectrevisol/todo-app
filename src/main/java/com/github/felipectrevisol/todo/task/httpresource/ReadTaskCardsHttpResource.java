package com.github.felipectrevisol.todo.task.httpresource;

import com.github.felipectrevisol.todo.task.TaskCardAdder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tasks")
public class ReadTaskCardsHttpResource {
    
    private final TaskCardAdder adder;

    public ReadTaskCardsHttpResource(final TaskCardAdder adder) {
        this.adder = adder;
    }

    @GetMapping
    public String getMethodName() {
        this.adder.add(new com.github.felipectrevisol.todo.task.TaskCard("Sample Task", 1));
        return "Hello World!";
    }
}