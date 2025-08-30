package com.github.felipectrevisol.todo.task.httpresource;

import org.springframework.http.HttpStatus;
import com.github.felipectrevisol.todo.task.TaskCardAdder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/task")
public class AddTaskCardsHttpResource {

    private TaskCardAdder adder;

    public AddTaskCardsHttpResource(final TaskCardAdder adder) {
        this.adder = adder;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody HttpBody httpBody) {
        this.adder.add(httpBody.payload());
    }
}