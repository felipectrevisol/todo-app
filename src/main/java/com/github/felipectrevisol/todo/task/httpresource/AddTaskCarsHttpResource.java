package com.github.felipectrevisol.todo.task.httpresource;

import org.springframework.http.HttpStatus;
import com.github.felipectrevisol.todo.task.TaskCardAdder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class AddTaskCarsHttpResource {

    private TaskCardAdder adder;

    public AddTaskCarsHttpResource(final TaskCardAdder adder) {
        this.adder = adder;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody HttpBody httpBody) {
        this.adder.add(new com.github.felipectrevisol.todo.task.TaskCard(httpBody.title(), httpBody.priority()));
    }
}