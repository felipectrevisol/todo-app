package com.github.felipectrevisol.todo.task.httpresource;

import com.github.felipectrevisol.todo.task.TaskCard;

record HttpBody(String title, int priority) {
    final TaskCard payload() {
        return new TaskCard(title, priority);
    }
}