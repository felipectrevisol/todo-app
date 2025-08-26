package com.github.felipectrevisol.todo.task.httpresource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class AddTaskCarsHttpResource {
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void post(@RequestBody HttpBody httpBody) {
        System.out.println(httpBody.title());
        System.out.println(httpBody.priority());
    }
}